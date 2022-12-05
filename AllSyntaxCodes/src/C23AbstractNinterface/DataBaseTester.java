package C23AbstractNinterface;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}

