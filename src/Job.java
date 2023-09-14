import java.util.Objects;

public class Job {
	
	int jobId;
	String jobTech;
	String jobDesc;
	
	public Job() {
	}
	
	public Job(int jobId, String jobTech, String jobDesc) {
		super();
		this.jobId = jobId;
		this.jobTech = jobTech;
		this.jobDesc = jobDesc;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTech() {
		return jobTech;
	}
	public void setJobTech(String jobTech) {
		this.jobTech = jobTech;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTech=" + jobTech + ", jobDesc=" + jobDesc + "]";
	}

	
	
	

}
