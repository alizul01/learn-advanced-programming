class MockMain {
    public static void main(String[] args) {
      Query query = new Query(new MockDBConnection());  
      System.out.println(query.read());
    }
  }