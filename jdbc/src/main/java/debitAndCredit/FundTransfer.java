package debitAndCredit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FundTransfer {

    public void transfer() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                DBDetails.URL,
                DBDetails.USER,
                DBDetails.PWD);

        try {

            int senderAcc = 1234;
            int receiverAcc = 6789;
            int amount = 1000;

            // Start Transaction
            con.setAutoCommit(false);

            // Get Sender Balance
            PreparedStatement ps =
                    con.prepareStatement(DBDetails.GET_BALANCE);

            ps.setInt(1, senderAcc);
            
            System.out.println(DBDetails.GET_BALANCE);
            System.out.println("Sender Acc = " + senderAcc);

            ResultSet rs = ps.executeQuery();

            int senderBalance = -1;

            if (rs.next()) {
                senderBalance = rs.getInt(1);
            }

            if (senderBalance == -1) {
                throw new Exception("Sender Account Not Found");
            }

            System.out.println("Sender Balance : "
                    + senderBalance);

            // Check Balance
            if (senderBalance < amount) {
                throw new Exception("Insufficient Balance");
            }

            // Debit Sender
            senderBalance = senderBalance - amount;

            PreparedStatement ps1 =
                    con.prepareStatement(DBDetails.UPDATE_BALANCE);

            ps1.setInt(1, senderBalance);
            ps1.setInt(2, senderAcc);

            int senderRows = ps1.executeUpdate();

            System.out.println(
                    "Sender Updated Rows : "
                            + senderRows);

            // Get Receiver Balance
            PreparedStatement ps2 =
                    con.prepareStatement(DBDetails.GET_BALANCE);

            ps2.setInt(1, receiverAcc);

            ResultSet rs2 = ps2.executeQuery();

            int receiverBalance = -1;

            if (rs2.next()) {
                receiverBalance = rs2.getInt("balance");
            }

            if (receiverBalance == -1) {
                throw new Exception("Receiver Account Not Found");
            }

            System.out.println(
                    "Receiver Balance : "
                            + receiverBalance);

            // Credit Receiver
            receiverBalance = receiverBalance + amount;

            PreparedStatement ps3 =
                    con.prepareStatement(DBDetails.UPDATE_BALANCE);

            ps3.setInt(1, receiverBalance);
            ps3.setInt(2, receiverAcc);

            int receiverRows = ps3.executeUpdate();

            System.out.println(
                    "Receiver Updated Rows : "
                            + receiverRows);

            // Commit Transaction
            con.commit();

            System.out.println(
                    "Fund Transfer Successful");

            System.out.println(
                    "Transferred Amount : "
                            + amount);

        } catch (Exception e) {

            con.rollback();

            System.out.println(
                    "Transaction Failed");

            System.out.println(
                    e.getMessage());
        } finally {

            con.close();
        }
    }
}