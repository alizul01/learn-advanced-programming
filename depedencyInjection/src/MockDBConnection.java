class MockDBConnection implements IQuery  {
    public String select() {
      return "From Mock";
    }
  }