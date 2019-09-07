package org.sefglobal.core.partnership.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Represent a university with engagement count
 */
public class RankedUniversity extends University{

    private int engagement;

    public RankedUniversity() {
    }

    public RankedUniversity(ResultSet resultSet) throws SQLException {
        super(resultSet);
        this.engagement = resultSet.getInt("engagement");
    }

    public int getEngagement() {
        return engagement;
    }

    public void setEngagement(int engagement) {
        this.engagement = engagement;
    }
}
