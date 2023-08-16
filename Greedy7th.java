import java.util.*;
public class Greedy7th{
    //defining all the information as objects of a class
    static class Job{
        int deadline;
        int profit;
        int id;//0(A),1(B),2(C),3(D)
        public Job(int i, int d, int p){
            //this is a constructor of the job
            id = i;
            deadline = d;
            profit = p;
        }
    }//blueprint of a job
    public static void main(String args[]){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();//this is an arraylist whose 
        // type is job. And this is an arraylist of objects of the class job
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);//descending order sorted
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maximum jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}