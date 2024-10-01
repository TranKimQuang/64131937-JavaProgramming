package Creational.Singleton.Ex2;

import java.util.HashSet;
import java.util.Set;

import static Creational.Singleton.Ex2.Candidate.BIDEN;
import static Creational.Singleton.Ex2.Candidate.TRUMP;

public class Election {
  private static Election instance;
  private int votesTrump = 0;
  private int votesBiden = 0;


  private Set<String> voters = new HashSet<>();
  private Election() {}


  public static Election getInstance() {
    if (instance == null) {
      instance = new Election();
    }
    return instance;
  }
  public void vote(String voterId, Candidate candidate) {

    if (voters.contains(voterId)) {
      System.out.println("Người bầu với ID " + voterId + " đã bầu trước đó, không thể bầu lại.");
    } else {

      voters.add(voterId);
      switch (candidate) {
        case TRUMP -> votesTrump++;
        case BIDEN -> votesBiden++;
      }
      System.out.println("Bỏ phiếu thành công cho " + candidate + " bởi người bầu " + voterId);
    }
  }
  public int getVotesTrump() {
    return votesTrump;
  }
  public int getVotesBiden() {
    return votesBiden;
  }

}
