package com.neotech.testbase;

import com.neotech.pages.AddContactDetailsPageElements;
import com.neotech.pages.AddDependentsPageElements;
import com.neotech.pages.AddEducationPageElements;
import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.AddImmirgationPageElements;
import com.neotech.pages.AddLanguagePageElements;
import com.neotech.pages.AddLicensePageElements;
import com.neotech.pages.AddMembershipPageElements;
import com.neotech.pages.AddSocialMediaDetailsPageElements;
import com.neotech.pages.AddWorkExperiencePageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.DisciplinaryCaseElements;
import com.neotech.pages.EmergencyContactsPageElements;
import com.neotech.pages.EmployeeDetailPageElements;
import com.neotech.pages.EmployeeListPageElements;
import com.neotech.pages.ImmirgationPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PersonalDetailsPageElements;
import com.neotech.pages.QualificationPageElements;
import com.neotech.pages.ReportPageElements;
import com.neotech.pages.SkillPageElements;
import com.neotech.pages.SubordinatePageElements;
import com.neotech.pages.SupervisorPageElements;
import com.neotech.pages.WorkWeekPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static AddEmployeePageElements addEmployee;
	public static PersonalDetailsPageElements personalDetails;
	public static ImmirgationPageElements immirgation;
	public static AddImmirgationPageElements addImmirgation;
	public static EmergencyContactsPageElements emergency;
	public static AddDependentsPageElements dependency;
	public static DisciplinaryCaseElements discipline;
	public static AddEducationPageElements addEducation;
	public static QualificationPageElements qualification;
	public static SkillPageElements skill;
	public static EmployeeListPageElements employeeList;
	public static EmployeeDetailPageElements empDetails;
	public static AddWorkExperiencePageElements workExperience;
	public static WorkWeekPageElements workWeek;
	public static AddContactDetailsPageElements contactDetails;
	public static AddSocialMediaDetailsPageElements social;
	public static AddLicensePageElements license;
    public static AddLanguagePageElements language;
    public static ReportPageElements report;
    public static SubordinatePageElements subordinate;
    public static SupervisorPageElements supervisor;
    public static AddMembershipPageElements membership;
	
	public static void initialize() 
	{
		login=new LoginPageElements();
		dash=new  DashboardPageElements();	
		addEmployee = new AddEmployeePageElements();
		personalDetails = new PersonalDetailsPageElements();
		immirgation = new ImmirgationPageElements();
		addImmirgation = new AddImmirgationPageElements();
		emergency = new EmergencyContactsPageElements();
		dependency = new AddDependentsPageElements();
		discipline = new DisciplinaryCaseElements();
		addEducation=new AddEducationPageElements();
		qualification=new QualificationPageElements();
		skill=new SkillPageElements();
		employeeList=new EmployeeListPageElements();
		empDetails = new EmployeeDetailPageElements();
		contactDetails = new AddContactDetailsPageElements();
		social = new AddSocialMediaDetailsPageElements();
		workExperience= new AddWorkExperiencePageElements();
		workWeek = new WorkWeekPageElements();
		license = new AddLicensePageElements();
        language = new AddLanguagePageElements();
		report=new ReportPageElements();
		subordinate=new SubordinatePageElements();
		supervisor=new SupervisorPageElements();
        membership=new AddMembershipPageElements();
	}
	
	
	
	
}