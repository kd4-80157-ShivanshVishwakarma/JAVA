package sunbeam.com.cand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDao implements AutoCloseable{
	private Connection con;
	public PartyVotesDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<PartyVotes> getPartyWiseVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql="select party,sum(votes) as vts from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
//					int id = rs.getInt("id");
//					String name = rs.getString("name");
					String party1 = rs.getString("party");
					int votes1 = rs.getInt("vts");
					PartyVotes p = new PartyVotes( party1, votes1);
					list.add(p);
				}
			}
		}
		return list;
		
	}
}
