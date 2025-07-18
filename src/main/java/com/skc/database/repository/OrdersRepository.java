package com.skc.database.repository;

import com.skc.database.model.NameAge;
import com.skc.database.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    List<Orders> findByOid(int oid );

    List<Orders> findByOidAndCid(int oid, String cid);
}
