package Creational.Singleton.Ex2;

public class Main {
  public static void main(String[] args) {
    Election election = Election.getInstance();
    election.vote("vote1",Candidate.TRUMP);
    election.vote("vote2",Candidate.BIDEN);
    election.vote("vote3",Candidate.BIDEN);
    election.vote("vote3",Candidate.TRUMP);
    System.out.println(Election.getInstance().getVotesBiden());
    System.out.println(Election.getInstance().getVotesTrump());

  }
}
