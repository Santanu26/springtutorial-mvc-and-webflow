package com.springframework.springPractice04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("noticesDao")
public class NoticesDAO {

	private static final String fetchWithID = "select * from notices where id= :id";
	private static final String selectAllQuery = "select * from notices";

	private static final String deleteNoticeWithID = "delete from notices where id = :id";

	private static final String insertNotice = "insert into notices(name , email , text) values(:name , :email , :text)";

	// private JdbcTemplate jdbc;
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		// this.jdbc = new JdbcTemplate(jdbc);
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public boolean create(Notice notice) {
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(notice);
		return jdbc.update(insertNotice, source) == 1;

	}

	public boolean delete(int id) {
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return jdbc.update(deleteNoticeWithID, source) == 1;
	}

	public Notice getNotice(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject(fetchWithID, params, new RowMapper<Notice>() {

			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();
				notice.setId(rs.getInt("id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
				notice.setText(rs.getString("text"));
				return notice;
			}
		});
	}

	public List<Notice> getNotices() {

		return jdbc.query(selectAllQuery, new RowMapper<Notice>() {

			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();

				notice.setId(rs.getInt("id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
				notice.setText(rs.getString("text"));
				return notice;
			}
		});
	}
}
