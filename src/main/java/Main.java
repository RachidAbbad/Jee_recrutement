import com.Dao.DaoSqlServeur;
import com.Models.CandidatEntity;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {


    public static void main(final String[] args) throws Exception {
        DaoSqlServeur newSession = new DaoSqlServeur();
        CandidatEntity newCandidatEntity = new CandidatEntity();

        newCandidatEntity.setCivilite("Marie");
        newCandidatEntity.setNomComplet("Marie");
        newCandidatEntity.setPhotoUrl("/Images");
        newCandidatEntity.setTitreEmploi("FrontEnd");
        newSession.addCandidat(newCandidatEntity);
    }
}