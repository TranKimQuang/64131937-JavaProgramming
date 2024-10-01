package Creational.Singleton.Ex2;

public class User {
  private String name;
  public User(String name) {
    this.name = name;
  }
  public void vote(Candidate candidate) {
    Election election = Election.getInstance();
    election.vote(this.name, candidate);
  }
  public String getName() {
    return name;
  }

}

