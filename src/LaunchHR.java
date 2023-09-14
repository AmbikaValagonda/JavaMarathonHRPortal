import java.util.Scanner;

public class LaunchHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welome to HR Job Portal");
		try (Scanner sc = new Scanner(System.in)) {
			String role = null;
			Job []jobs = new Job[4];
			jobs[0] = new Job(101, "Java", "Java Developer");
			jobs[1] = new Job(102, "Python", "Python Developer");
			jobs[2] = new Job(103, ".Net", "Java Developer");
			jobs[3] = new Job(104, "Java", "Java Developer");
			int i = 4;
			boolean flag = true;


			while(flag) {
				System.out.println("Enter Role : ");
				role = sc.nextLine();
				if(role.equals("HR")) {
					System.out.println("Inside HR");
					
					Job j1 = new Job();
					System.out.println("Enter Job ID");
					j1.setJobId(Integer.parseInt(sc.nextLine()));
					System.out.println("Enter Job Tech");
					j1.setJobTech(sc.nextLine());
					System.out.println("Enter Job Desc");
					j1.setJobDesc(sc.nextLine());
					
					jobs[i] = j1;
					
					System.out.println("Job Created successfully: " + j1.toString());
					
					i++;
				}
				else if(role.equals("JS")) {
					System.out.println("Inside JS");
					for(Job jobb: jobs) {
						if(jobb !=null)
							System.out.println(jobb);
						
					}
					
					System.out.println("Enter the Tech you want to search: ");
					String sValue = sc.nextLine();
					
					for(Job jobb: jobs) {
						if(jobb !=null && jobb.jobTech.contains(sValue))
							System.out.println(jobb);
						
					}
				}
				else {
					System.out.println("Invalid Role. Exiting !");
					flag = false;
				}
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
