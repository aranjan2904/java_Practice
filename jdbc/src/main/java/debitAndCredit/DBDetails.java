package debitAndCredit;

public class DBDetails {

    public static final String URL =
            "jdbc:mysql://localhost:3306/bankdb";

    public static final String USER = "root";

    public static final String PWD = "Shubham@2904";

    public static final String GET_BALANCE =
            "SELECT balance FROM account WHERE acc_no = ?";

    public static final String UPDATE_BALANCE =
            "UPDATE account SET balance = ? WHERE acc_no = ?";
}