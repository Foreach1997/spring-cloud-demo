package com.xl.common.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author NING MEI
 */
@Entity
@Table(name = "order", schema = "cloud", catalog = "")
public class OrderEntity implements Serializable {
    private long id;
    private String orderNo;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_no")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                Objects.equals(orderNo, that.orderNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNo);
    }
}
