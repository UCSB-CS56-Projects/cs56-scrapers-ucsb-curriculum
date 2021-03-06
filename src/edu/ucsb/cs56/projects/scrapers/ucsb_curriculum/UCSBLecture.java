package edu.ucsb.cs56.projects.scrapers.ucsb_curriculum;

import java.util.ArrayList;

/** UCSBLecture -- Stores information from a single lecture,
    plus contains a list of associated UCSBSection objects.

@author Phill Conrad
@author James Neally
@author Kevin Mai
@version W12 Issue 396 extension of cs56.projects.W11, Issue 50
@see UCSBLectureTest

*/

public class UCSBLecture {
    
    private String courseTitle; // e.g. "CMPSC     8"
    private String fullTitle;   // e.g. "Introduction to Computer Science"
    private String description; // e.g. "Introduction to computer program   development for students with little to no   programming experience. Basic programming   concepts, variables and expressions, data and control structures,   algorithms, debugging, program design, and documentation."
    private String preRequisite; // 
    private String college; // e.g. "ENGR"
    private String units; // e.g. 4.0
    private String grading; // e.g. "Letter"
    // note: leave out textbook info
    private String primaryCourseAbbr; // e.g. "INTRO TO COMP SCI"
    private String levelLimit; // e.g. "S" or "U" (e.g. on CS189B)
    
    private String majorLimitPass; // e.g. "12"
    private String messages; // see CMPSC 189B for example
    
    private String majorLimit; // e.g. "These majors only: PRCMP PRCPS CMPEN PRCME EE PRMTH PRECM STATS STSCI ACTSC
    private String instructor; // e.g. "BUONI M J"   (Note: for lecture section)
    private String days; // e.g. "T R"
    private String time; // e.g. "3:30pm - 4:45pm"
    private String room; // e.g. "CHEM 1171"
    private int enrolled; // e.g. from 63 / 88, take the 63
    private int capacity; // e.g. from 63 / 88, take the 88
    
    private String status; //e.g Full e.g. Closed
	private String enrollCode; //e.g. 00026

    private ArrayList<UCSBSection> sections = new ArrayList<>(); // all of the sections

    // TODO: Write constructor(s), getters/setters, toString(), equals()

    /**
     * Default Constructor
     */
    public UCSBLecture(){
	//Need to initialize ArrayList<UCSBSection> --Worst Bug Ever
	sections = new ArrayList<UCSBSection>();
    }

    /**
       Simple constructor does not set all the possible/needed attributes. TODO: Constructor with more params
       @param courseTitle e.g. "CMPSC     8"
       @param primaryCourseAbbr e.g. "INTRO TO COMP SCI"
       @param status e.g. "Closed", "Full", etc
       @param instructor e.g. "BUONI M J"   (Note: for lecture)
       @param days e.g. "T R"
       @param time e.g. "3:30pm - 4:45pm"
       @param room e.g. "CHEM 1171"
       @param enrolled e.g. from 63 / 88, take the 63
       @param capacity e.g. from 63 / 88, take the 88
	   @param enrollCode e.g. "55577"
     */

    public UCSBLecture(
    		String courseTitle,
    		String primaryCourseAbbr,
    		String status,
    		String instructor,
    		String days,   		
		String time,
		String room,
		String grading,
		String units,
		String college,
		String preRequisite,
		String description,
		String fullTitle,
		int enrolled,
		int capacity,
		String enrollCode,
		String levelLimit,
		String majorLimitPass,
		String messages,
		String majorLimit){

		this.courseTitle = courseTitle;
		this.primaryCourseAbbr = primaryCourseAbbr;
		this.status = status;
		this.instructor = instructor;
		this.days = days;
		this.time = time;
		this.room = room;
		this.enrolled = enrolled;
		this.capacity = capacity;
		this.enrollCode = enrollCode;
		this.majorLimit = majorLimit;
		this.messages = messages;
		this.majorLimitPass = majorLimitPass;
		this.levelLimit = levelLimit;
		this.fullTitle = fullTitle;
		this.description = description;
		this.preRequisite = preRequisite;
		this.grading = grading;
		this.units = units;
		this.college = college;
		sections = new ArrayList<UCSBSection>();
	}
    
     /**
       Copy constructor
       
       @param orig object to be copied

     */

    public UCSBLecture(UCSBLecture orig) {

		this.courseTitle = orig.courseTitle;
		this.fullTitle = orig.fullTitle;
		this.description = orig.description;
		this.preRequisite = orig.preRequisite;
		this.college = orig.college;
		this.units = orig.units;
		this.grading = orig.grading;
		this.primaryCourseAbbr = orig.primaryCourseAbbr;
		this.status = orig.status;
		this.majorLimitPass = orig.majorLimitPass;
		this.majorLimit = orig.majorLimit;
		this.messages = orig.messages;
		this.instructor = orig.instructor;
		this.days = orig.days;
		this.time = orig.time;
		this.room = orig.room;
		this.enrolled = orig.enrolled;
		this.capacity = orig.capacity;
		this.enrollCode = orig.enrollCode;
		this.sections = orig.sections;
		this.levelLimit = orig.levelLimit;
		
	}
	
	/* Getters and Setters */
	public String getCourseTitle(){ return courseTitle;}
	public void setCourseTitle(String title){ this.courseTitle = title;}
	
	public String getFullTitle(){ return fullTitle;}
	public void setFullTitle(String fullTitle){ this.fullTitle = fullTitle;}
	
	public String getPrerequisite(){ return preRequisite;}
	public void setPrerequisite(String prerequisite){ this.preRequisite = prerequisite;}
	
	public String getUnits(){ return units;}
	public void setUnits(String units){ this.units = units;}
	
	public String getGrading() { return grading; }
	public void setGrading(String grading) { this.grading = grading; }
	
	public String getCollege(){ return college;}
	public void setCollege(String college){ this.college = college;}
	
	public String getDescription(){ return description;}
	public void setDescription(String description){ this.description = description;}
	
	public String getPrimaryCourseAbbr(){ return primaryCourseAbbr;}
    public void setPrimaryCourseAbbr(String abbr){ this.primaryCourseAbbr = abbr;}

    public String getStatus(){ return status;}
    public void setStatus(String status){ this.status = status;}

    public String getInstructor(){ return instructor;}
    public void setInstructor(String instructor){ this.instructor = instructor;}

    public String getDays(){ return days;}
    public void setDays(String days){ this.days = days;}

    public String getTime(){ return time;}
    public void setTime(String time){ this.time = time;}

    public String getRoom(){ return room;}
    public void setRoom(String room){ this.room = room;}

    public int getEnrolled(){ return enrolled;}
    public void setEnrolled(int enrolled){ this.enrolled = enrolled;}

    public int getCapacity(){ return capacity;}
    public void setCapacity(int capacity){ this.capacity = capacity;}
	
	public String getEnrollCode() { return enrollCode; }
	public void setEnrollCode(String enrollCode) { this.enrollCode = enrollCode; }
	
	public String getMajorLimit() { return majorLimit; }
	public void setMajorLimit(String majorLimit) { this.majorLimit = majorLimit; }
	
	public String getLevelLimit() { return levelLimit; }
	public void setLevelLimit(String levelLimit) { this.levelLimit = levelLimit; }
	
	public String getMajorLimitPass() { return majorLimitPass; }
	public void setMajorLimitPass(String majorLimitPass) { this.majorLimitPass = majorLimitPass; }
	
	public String getMessages() { return messages; }
	public void setMessages(String messages) { this.messages = messages; }
	
	

    public ArrayList<UCSBSection> getSections(){ return sections; }
    public void addSection(UCSBSection section){
		sections.add(section);
    }

    public String toString(){    		
        String result = "";
        result += "Course Title: " + courseTitle + "\n"
                + "Course Abbreviation: " + primaryCourseAbbr + "\n"
                
                + "\n ---- Course Details for " + courseTitle + "----\n"
                + "Course Full Title: " + fullTitle + "\n"
                + "Course Description: " + description + "\n"
                + "Course Prerequisites: " + preRequisite + "\n"
                + "College: " + college + "\n"
                + "Messages: " + messages + "\n"
                
                + "\n ---- Enrollment Details for " + courseTitle + "----\n"
                + "Lecture Status: " + status + "\n"
                + "Enrolled / Capacity: " + enrolled + " / " + capacity + "\n"
                + "Units: " + units + "\n"
                + "Grading: " + grading + "\n"
                + "Level Limit: " + levelLimit + "\n"
                + "Major Limit: " + majorLimit + "\n"
                + "Major Limit Pass: " + majorLimitPass + "\n"
		        + "Enroll Code: " + enrollCode + "\n"
                
                + "\n ---- Lecture Details for " + courseTitle + "----\n"
                + "Lecture Instructor: " + instructor + "\n"
                + "Lecture Days: " + days + "\n"
                + "Lecture Time: " + time + "\n"
                + "Lecture Room: " + room + "\n";
                
        return result;
    }

}
