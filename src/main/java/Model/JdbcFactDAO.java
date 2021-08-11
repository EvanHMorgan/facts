package Model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcFactDAO {

    //Instance Variables
    private final JdbcTemplate jdbcTemplate;

    //Constructor
    public JdbcFactDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //Getters & Setters


    //Methods



}


//Methods
// public List<RestockProduct> getRestockList() {
//
//     List<RestockProduct> restockProductList = new ArrayList<>();
//
//     String sql = "SELECT slot_id, description, price, snack_type " +
//             "FROM vm_item;";
//
//     SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
//     while (results.next()) {
//         restockProductList.add(mapRowToRestockProduct(results));
//     }
//     return restockProductList;