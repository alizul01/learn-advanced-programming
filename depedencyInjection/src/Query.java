class Query {

  // Query -> DBConnection
  // No if else, no need if else
  // cannot pas Object you cannot pass string
  // Just implement basic feature of OOP -> Polymorphism
  
  IQuery inject;
  public Query(IQuery inject) {
    this.inject = inject;
  }
  
  public String read() {
    System.out.println(inject);
    return inject.select();
  }
  
}