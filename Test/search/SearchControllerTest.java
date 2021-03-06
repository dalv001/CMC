/**
 * 
 */
package search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DB.DBController;
import university.University;
import user.User;
import user.UserUI;
import search.searchController;

/**
 * @author giteghete001
 *
 */
public class SearchControllerTest {
	searchController controller;
	DBController dataBase;
	


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//creating the universities
		University uni1 = new University("Circle University", "Minnesota", "location1", "control", 53, 40.5, 50.5, 1000, 2000, 2000.00, 1500.00, 100, 30.00, 50.00, 98, 23, 80, "majors");
		//University uni2 = new University("peterUni", "Chicago", 1000);
		//University uni3 = new University("ohmannUni", "Texas", 1200);
		
		this.controller = new searchController();
		this.dataBase = new DBController("goldencircle", "cs230");
		
		//Adding universities to DB
		this.dataBase.addUser("test", "mcTesty", "testy", "123", 'u');
		this.dataBase.addSchool("Circle University");
		//this.dataBase.addSchool("peterUni"));
		//this.dataBase.addSchool("ohmannUni"));
		
		
		
	}
	
	//userControllerTest, 

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void testSearchSchool() {
		Assert.assertTrue("Circle University was found", this.controller.searchSchool("Minnesota", 53) == true);
		
		Assert.assertTrue("University Not Found", this.controller.searchSchool("fdb", 1000)== false);
	}

}
