package info.fanfou.db.dao.mapper;

import info.fanfou.db.entity.Order;
import info.fanfou.db.entity.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    Order selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMER_ORDER
     *
     * @mbggenerated Fri Aug 21 09:15:58 CST 2015
     */
    int updateByPrimaryKey(Order record);
}