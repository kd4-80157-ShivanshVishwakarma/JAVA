package sunbeam.com.cand;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.user.User;

	public class MainTest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		    
			/*
			try(CandidateDao dao = new CandidateDao()) {
				System.out.print("Enter candidate id to be deleted: ");
				int id = sc.nextInt();
				int cnt = dao.deleteById(id);
				System.out.println("Candidates deleted: " + cnt);
			} // dao.close();
			catch (Exception e) {
				e.printStackTrace();
			}
			*/
			
			/*
			try(CandidateDao dao = new CandidateDao()) {
				List<Candidate> list = dao.findAll();
				list.forEach(c -> System.out.println(c));
			} // dao.close();
			catch (Exception e) {
				e.printStackTrace();
			}
			*/

			
			/*try(CandidateDao dao = new CandidateDao()) {
				System.out.print("Enter party: ");
				String party = sc.next();
				List<Candidate> list = dao.findByParty(party);
				list.forEach(c -> System.out.println(c));
			} // dao.close();
			catch (Exception e) {
				e.printStackTrace();
			}*/
			
			
			/*try(CandidateDao dao = new CandidateDao()) {
				System.out.print("Enter candidate id (to vote): ");
				int candidateId = sc.nextInt();
				int cnt = dao.incrementVote(candidateId);
				System.out.println("Rows updated: " + cnt);
			} // dao.close();
			catch (Exception e) {
				e.printStackTrace();
			}*/
			/*try(CandidateDao dao =new CandidateDao()){
				System.out.println("Adding a new candidate ");
				Candidate c=new Candidate();
				System.out.println("Enter name : ");
				String name=sc.next();
				System.out.println("Enter party name : ");
				String party=sc.next();
				System.out.println("Enter votes to be added : ");
				int votes=sc.nextInt();
				c.setName(name);
				c.setParty(party);
				c.setVotes(votes);
				int cnt=dao.saveNewCand(c);
				System.out.println("Rows affected : "+cnt);
				
			}
			catch(Exception er){
				er.printStackTrace(); 
			}*/
			/*try(CandidateDao dao =new CandidateDao()){
				System.out.println("Updating a candidate ");
				Candidate c=new Candidate();
				System.out.println("Enter id to update name and party : ");
				int id=sc.nextInt();
				System.out.println("Update name : ");
				String name=sc.next();
				System.out.println("Update party name : ");
				String party=sc.next();
				c.setId(id);
				c.setName(name);
				c.setParty(party);
				int cnt=dao.update			stmt.setString(5, u.getDob());Cand(c);
				System.out.println("Rows affected : "+cnt);
				
			}
			catch(Exception er){
				er.printStackTrace(); 
			}*/
			/*try(PartyVotesDao p = new PartyVotesDao()){
				System.out.println("Get Party Wise Total Votes.");
				List<PartyVotes>pList = new ArrayList<>();
				pList = p.getPartyWiseVotes();
				pList.forEach(x->System.out.println(x));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}