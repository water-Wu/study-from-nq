package com.itheima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //声明这是实体类
@Table(name="cst_customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private long custId;
    @Column(name="cust_name")
    private String custName;
    @Column(name="cust_source")
    private String custSource;
    @Column(name="cust_industry")
    private String custIndustry;
    @Column(name="cust_level")
    private String custLevel;
    @Column(name="cust_address")
    private String custAddress;
    @Column(name="cust_phone")
    private String custPhone;
}
