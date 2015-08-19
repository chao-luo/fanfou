package info.fanfou.db.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.DETAILE_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Long detaileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.ORDER_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.GOODS_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.COUNT
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Long count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.CREATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Date createdDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORDER_DETAIL.UPDATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private Date updatedDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ORDER_DETAIL
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_DETAIL
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public OrderDetail(Long detaileId, Long orderId, Long goodsId, Long count, Date createdDatetime, Date updatedDatetime) {
        this.detaileId = detaileId;
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.count = count;
        this.createdDatetime = createdDatetime;
        this.updatedDatetime = updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDER_DETAIL
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public OrderDetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.DETAILE_ID
     *
     * @return the value of ORDER_DETAIL.DETAILE_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Long getDetaileId() {
        return detaileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.DETAILE_ID
     *
     * @param detaileId the value for ORDER_DETAIL.DETAILE_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setDetaileId(Long detaileId) {
        this.detaileId = detaileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.ORDER_ID
     *
     * @return the value of ORDER_DETAIL.ORDER_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.ORDER_ID
     *
     * @param orderId the value for ORDER_DETAIL.ORDER_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.GOODS_ID
     *
     * @return the value of ORDER_DETAIL.GOODS_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.GOODS_ID
     *
     * @param goodsId the value for ORDER_DETAIL.GOODS_ID
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.COUNT
     *
     * @return the value of ORDER_DETAIL.COUNT
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Long getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.COUNT
     *
     * @param count the value for ORDER_DETAIL.COUNT
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.CREATED_DATETIME
     *
     * @return the value of ORDER_DETAIL.CREATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.CREATED_DATETIME
     *
     * @param createdDatetime the value for ORDER_DETAIL.CREATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORDER_DETAIL.UPDATED_DATETIME
     *
     * @return the value of ORDER_DETAIL.UPDATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORDER_DETAIL.UPDATED_DATETIME
     *
     * @param updatedDatetime the value for ORDER_DETAIL.UPDATED_DATETIME
     *
     * @mbggenerated Wed Aug 19 22:10:21 CST 2015
     */
    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }
}