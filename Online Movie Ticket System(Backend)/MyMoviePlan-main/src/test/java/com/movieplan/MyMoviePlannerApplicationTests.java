
package com.movieplan;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertNotEquals; 
//import static org.junit.Assert.assertNotNull; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.movieplan.model.*;

//import static org.junit.api.Assertions.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


import com.movieplan.controller.*;
import com.movieplan.repository.*;

@SpringBootTest
class MyMoviePlannerApplicationTests {

	@Autowired
	private bookedSeatsRepository bookedSeatsRepository;

	@Autowired
	private bookingHistoryRepository bookingHistoryRepository;

	@Autowired
	private movieRepository movieRepository;

	@Autowired
	private showRepository showRepository;

	@Autowired
	private theaterRepository theaterRepository;

	@Autowired
	private userRepository userRepository;
	
	
	  @Test public void theater() { List<Theater> list =
			  theaterRepository.findAll(); assertThat(list).size().isGreaterThan(0); }
			 
			 @Test public void user() { List<User> list = userRepository.findAll();
			  assertThat(list).size().isGreaterThan(0); }
			  
			 @Test public void movie() { List<Movie> list = movieRepository.findAll();
			  assertThat(list).size().isGreaterThan(0); }
			  
			  @Test public void bookedseats() { List<BookedSeats> list =
			  bookedSeatsRepository.findAll(); assertThat(list).size().isGreaterThan(0); }
			  
			  @Test public void getTheater()
			  { 
				  Theater theater = theaterRepository.findById((long) 1).get(); 
			       Assert.assertEquals(1, theater.getId());
					   }
					  
			/* @Test public void getUser() 
			 { 
				 User user =userRepository.findByEmail("apple@gmail.com");
				 Assert.assertEquals("apple@gmail.com", user.getEmail());
				 }*/
					  
			 @Test public void getMovie() 
			 { 
				 Movie movie = movieRepository.findById((long) 2).get(); 
				 Assert.assertEquals(2, movie.getId());
				 }
					   
			@Test public void getBookedSeats() 
			{ 
				BookedSeats bookedseats = bookedSeatsRepository.findById((long) 1).get(); 
				Assert.assertEquals(1, bookedseats.getId());
				
			} 
}

	/*@Test
  public void addUser() 
  { 
	  User user = new User(); 
	  user.setId(5);
      user.setFirstName("Testing"); 
      user.setLastName("T");
      user.setPassword("Testing@123"); 
      user.setEmail("testing@gmail.com");
      user.setRole("user");
      userRepository.saveAndFlush(user);
      //assertNotNull(userRepository.findByEmail("testing@gmail.com").getEmail());
      Assert.assertNotNull(userRepository.findById(5.get());
  }
}*/
      
  
  
  //assertNotNull(userRepository.findByEmail("apple@gmail.com").getEmail()); }
  
  
/*
 * @Test public void addTheater() { Theater theater = new Theater();
 * theater.setId(1); theater.setTheatreName("Cinepolis");
 * theater.setTheatreAddress("Lake Mall"); theater.setTheatreSeatCapacity(null);
 * // theater.setMovie(1); theaterRepository.save(theater);
 * assertNotNull(theaterRepository.findById((long) 1).get()); }
 * 
 * @Test public void addMovie() { Movie movie = new Movie(); movie.setId(2);
 * movie.setName("The Girl on the Train"); movie.setGenre("Crime Thrillers");
 * movie.setLanguage("English"); movie.setDuration("2 hrs");
 * movieRepository.save(movie); assertNotNull(movieRepository.findById((long)
 * 2).get()); }
 * 
 * @Test public void addBookedSeats() { BookedSeats bookedseats = new
 * BookedSeats(); bookedseats.setId(1); bookedseats.setSeat("A1");
 * bookedseats.setTime("05:30:00");
 * //bookedseats.setDate("2022-10-27 05:30:00"); //bookedseats.setTheater(1);
 * bookedSeatsRepository.save(bookedseats);
 * assertNotNull(bookedSeatsRepository.findById((long) 2).get()); }*/

	
	
	
  
  