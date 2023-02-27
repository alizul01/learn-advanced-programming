class Main {
    public static void main(String[] args) {
        Query query = new Query(new DBConnection());
        System.out.println(query.read());
    }
}