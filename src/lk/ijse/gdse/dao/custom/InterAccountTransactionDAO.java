package lk.ijse.gdse.dao.custom;

import lk.ijse.gdse.dao.CrudDAO;
import lk.ijse.gdse.dao.SearchByTransactionId;
import lk.ijse.gdse.entity.InterAccountTransaction;

public interface InterAccountTransactionDAO extends CrudDAO<InterAccountTransaction>, SearchByTransactionId<InterAccountTransaction> {
}
