package com.whut.shuini.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbQuestionnaireContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbQuestionnaireContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidIsNull() {
            addCriterion("questionnaireTemplateId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidIsNotNull() {
            addCriterion("questionnaireTemplateId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidEqualTo(Integer value) {
            addCriterion("questionnaireTemplateId =", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidNotEqualTo(Integer value) {
            addCriterion("questionnaireTemplateId <>", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidGreaterThan(Integer value) {
            addCriterion("questionnaireTemplateId >", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionnaireTemplateId >=", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidLessThan(Integer value) {
            addCriterion("questionnaireTemplateId <", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("questionnaireTemplateId <=", value, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidIn(List<Integer> values) {
            addCriterion("questionnaireTemplateId in", values, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidNotIn(List<Integer> values) {
            addCriterion("questionnaireTemplateId not in", values, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidBetween(Integer value1, Integer value2) {
            addCriterion("questionnaireTemplateId between", value1, value2, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andQuestionnairetemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionnaireTemplateId not between", value1, value2, "questionnairetemplateid");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNull() {
            addCriterion("lastModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIsNotNull() {
            addCriterion("lastModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeEqualTo(Date value) {
            addCriterion("lastModifyTime =", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotEqualTo(Date value) {
            addCriterion("lastModifyTime <>", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThan(Date value) {
            addCriterion("lastModifyTime >", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifyTime >=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThan(Date value) {
            addCriterion("lastModifyTime <", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeLessThanOrEqualTo(Date value) {
            addCriterion("lastModifyTime <=", value, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeIn(List<Date> values) {
            addCriterion("lastModifyTime in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotIn(List<Date> values) {
            addCriterion("lastModifyTime not in", values, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeBetween(Date value1, Date value2) {
            addCriterion("lastModifyTime between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifytimeNotBetween(Date value1, Date value2) {
            addCriterion("lastModifyTime not between", value1, value2, "lastmodifytime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("accountId =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("accountId <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("accountId >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("accountId >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("accountId <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("accountId <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("accountId like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("accountId not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("accountId in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("accountId not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("accountId between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("accountId not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNull() {
            addCriterion("rejectReason is null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNotNull() {
            addCriterion("rejectReason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonEqualTo(String value) {
            addCriterion("rejectReason =", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotEqualTo(String value) {
            addCriterion("rejectReason <>", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThan(String value) {
            addCriterion("rejectReason >", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("rejectReason >=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThan(String value) {
            addCriterion("rejectReason <", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThanOrEqualTo(String value) {
            addCriterion("rejectReason <=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLike(String value) {
            addCriterion("rejectReason like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotLike(String value) {
            addCriterion("rejectReason not like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIn(List<String> values) {
            addCriterion("rejectReason in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotIn(List<String> values) {
            addCriterion("rejectReason not in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonBetween(String value1, String value2) {
            addCriterion("rejectReason between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotBetween(String value1, String value2) {
            addCriterion("rejectReason not between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andWjtypeIsNull() {
            addCriterion("wjType is null");
            return (Criteria) this;
        }

        public Criteria andWjtypeIsNotNull() {
            addCriterion("wjType is not null");
            return (Criteria) this;
        }

        public Criteria andWjtypeEqualTo(Integer value) {
            addCriterion("wjType =", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeNotEqualTo(Integer value) {
            addCriterion("wjType <>", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeGreaterThan(Integer value) {
            addCriterion("wjType >", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wjType >=", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeLessThan(Integer value) {
            addCriterion("wjType <", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeLessThanOrEqualTo(Integer value) {
            addCriterion("wjType <=", value, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeIn(List<Integer> values) {
            addCriterion("wjType in", values, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeNotIn(List<Integer> values) {
            addCriterion("wjType not in", values, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeBetween(Integer value1, Integer value2) {
            addCriterion("wjType between", value1, value2, "wjtype");
            return (Criteria) this;
        }

        public Criteria andWjtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("wjType not between", value1, value2, "wjtype");
            return (Criteria) this;
        }

        public Criteria andBiQynameIsNull() {
            addCriterion("bi_qyName is null");
            return (Criteria) this;
        }

        public Criteria andBiQynameIsNotNull() {
            addCriterion("bi_qyName is not null");
            return (Criteria) this;
        }

        public Criteria andBiQynameEqualTo(String value) {
            addCriterion("bi_qyName =", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameNotEqualTo(String value) {
            addCriterion("bi_qyName <>", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameGreaterThan(String value) {
            addCriterion("bi_qyName >", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameGreaterThanOrEqualTo(String value) {
            addCriterion("bi_qyName >=", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameLessThan(String value) {
            addCriterion("bi_qyName <", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameLessThanOrEqualTo(String value) {
            addCriterion("bi_qyName <=", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameLike(String value) {
            addCriterion("bi_qyName like", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameNotLike(String value) {
            addCriterion("bi_qyName not like", value, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameIn(List<String> values) {
            addCriterion("bi_qyName in", values, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameNotIn(List<String> values) {
            addCriterion("bi_qyName not in", values, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameBetween(String value1, String value2) {
            addCriterion("bi_qyName between", value1, value2, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQynameNotBetween(String value1, String value2) {
            addCriterion("bi_qyName not between", value1, value2, "biQyname");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressIsNull() {
            addCriterion("bi_qyAddress is null");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressIsNotNull() {
            addCriterion("bi_qyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressEqualTo(String value) {
            addCriterion("bi_qyAddress =", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressNotEqualTo(String value) {
            addCriterion("bi_qyAddress <>", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressGreaterThan(String value) {
            addCriterion("bi_qyAddress >", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("bi_qyAddress >=", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressLessThan(String value) {
            addCriterion("bi_qyAddress <", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressLessThanOrEqualTo(String value) {
            addCriterion("bi_qyAddress <=", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressLike(String value) {
            addCriterion("bi_qyAddress like", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressNotLike(String value) {
            addCriterion("bi_qyAddress not like", value, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressIn(List<String> values) {
            addCriterion("bi_qyAddress in", values, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressNotIn(List<String> values) {
            addCriterion("bi_qyAddress not in", values, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressBetween(String value1, String value2) {
            addCriterion("bi_qyAddress between", value1, value2, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiQyaddressNotBetween(String value1, String value2) {
            addCriterion("bi_qyAddress not between", value1, value2, "biQyaddress");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanIsNull() {
            addCriterion("bi_linkman is null");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanIsNotNull() {
            addCriterion("bi_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanEqualTo(String value) {
            addCriterion("bi_linkman =", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanNotEqualTo(String value) {
            addCriterion("bi_linkman <>", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanGreaterThan(String value) {
            addCriterion("bi_linkman >", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("bi_linkman >=", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanLessThan(String value) {
            addCriterion("bi_linkman <", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanLessThanOrEqualTo(String value) {
            addCriterion("bi_linkman <=", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanLike(String value) {
            addCriterion("bi_linkman like", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanNotLike(String value) {
            addCriterion("bi_linkman not like", value, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanIn(List<String> values) {
            addCriterion("bi_linkman in", values, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanNotIn(List<String> values) {
            addCriterion("bi_linkman not in", values, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanBetween(String value1, String value2) {
            addCriterion("bi_linkman between", value1, value2, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiLinkmanNotBetween(String value1, String value2) {
            addCriterion("bi_linkman not between", value1, value2, "biLinkman");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberIsNull() {
            addCriterion("bi_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberIsNotNull() {
            addCriterion("bi_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberEqualTo(String value) {
            addCriterion("bi_phoneNumber =", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberNotEqualTo(String value) {
            addCriterion("bi_phoneNumber <>", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberGreaterThan(String value) {
            addCriterion("bi_phoneNumber >", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("bi_phoneNumber >=", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberLessThan(String value) {
            addCriterion("bi_phoneNumber <", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("bi_phoneNumber <=", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberLike(String value) {
            addCriterion("bi_phoneNumber like", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberNotLike(String value) {
            addCriterion("bi_phoneNumber not like", value, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberIn(List<String> values) {
            addCriterion("bi_phoneNumber in", values, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberNotIn(List<String> values) {
            addCriterion("bi_phoneNumber not in", values, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberBetween(String value1, String value2) {
            addCriterion("bi_phoneNumber between", value1, value2, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andBiPhonenumberNotBetween(String value1, String value2) {
            addCriterion("bi_phoneNumber not between", value1, value2, "biPhonenumber");
            return (Criteria) this;
        }

        public Criteria andScxlbIsNull() {
            addCriterion("scxLb is null");
            return (Criteria) this;
        }

        public Criteria andScxlbIsNotNull() {
            addCriterion("scxLb is not null");
            return (Criteria) this;
        }

        public Criteria andScxlbEqualTo(String value) {
            addCriterion("scxLb =", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbNotEqualTo(String value) {
            addCriterion("scxLb <>", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbGreaterThan(String value) {
            addCriterion("scxLb >", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbGreaterThanOrEqualTo(String value) {
            addCriterion("scxLb >=", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbLessThan(String value) {
            addCriterion("scxLb <", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbLessThanOrEqualTo(String value) {
            addCriterion("scxLb <=", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbLike(String value) {
            addCriterion("scxLb like", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbNotLike(String value) {
            addCriterion("scxLb not like", value, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbIn(List<String> values) {
            addCriterion("scxLb in", values, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbNotIn(List<String> values) {
            addCriterion("scxLb not in", values, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbBetween(String value1, String value2) {
            addCriterion("scxLb between", value1, value2, "scxlb");
            return (Criteria) this;
        }

        public Criteria andScxlbNotBetween(String value1, String value2) {
            addCriterion("scxLb not between", value1, value2, "scxlb");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameIsNull() {
            addCriterion("bi_scLineName is null");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameIsNotNull() {
            addCriterion("bi_scLineName is not null");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameEqualTo(String value) {
            addCriterion("bi_scLineName =", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameNotEqualTo(String value) {
            addCriterion("bi_scLineName <>", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameGreaterThan(String value) {
            addCriterion("bi_scLineName >", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameGreaterThanOrEqualTo(String value) {
            addCriterion("bi_scLineName >=", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameLessThan(String value) {
            addCriterion("bi_scLineName <", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameLessThanOrEqualTo(String value) {
            addCriterion("bi_scLineName <=", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameLike(String value) {
            addCriterion("bi_scLineName like", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameNotLike(String value) {
            addCriterion("bi_scLineName not like", value, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameIn(List<String> values) {
            addCriterion("bi_scLineName in", values, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameNotIn(List<String> values) {
            addCriterion("bi_scLineName not in", values, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameBetween(String value1, String value2) {
            addCriterion("bi_scLineName between", value1, value2, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinenameNotBetween(String value1, String value2) {
            addCriterion("bi_scLineName not between", value1, value2, "biSclinename");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleIsNull() {
            addCriterion("bi_scLineScale is null");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleIsNotNull() {
            addCriterion("bi_scLineScale is not null");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleEqualTo(String value) {
            addCriterion("bi_scLineScale =", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleNotEqualTo(String value) {
            addCriterion("bi_scLineScale <>", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleGreaterThan(String value) {
            addCriterion("bi_scLineScale >", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleGreaterThanOrEqualTo(String value) {
            addCriterion("bi_scLineScale >=", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleLessThan(String value) {
            addCriterion("bi_scLineScale <", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleLessThanOrEqualTo(String value) {
            addCriterion("bi_scLineScale <=", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleLike(String value) {
            addCriterion("bi_scLineScale like", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleNotLike(String value) {
            addCriterion("bi_scLineScale not like", value, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleIn(List<String> values) {
            addCriterion("bi_scLineScale in", values, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleNotIn(List<String> values) {
            addCriterion("bi_scLineScale not in", values, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleBetween(String value1, String value2) {
            addCriterion("bi_scLineScale between", value1, value2, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andBiSclinescaleNotBetween(String value1, String value2) {
            addCriterion("bi_scLineScale not between", value1, value2, "biSclinescale");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclIsNull() {
            addCriterion("zyxh_slcl is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclIsNotNull() {
            addCriterion("zyxh_slcl is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclEqualTo(String value) {
            addCriterion("zyxh_slcl =", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclNotEqualTo(String value) {
            addCriterion("zyxh_slcl <>", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclGreaterThan(String value) {
            addCriterion("zyxh_slcl >", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclGreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_slcl >=", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclLessThan(String value) {
            addCriterion("zyxh_slcl <", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclLessThanOrEqualTo(String value) {
            addCriterion("zyxh_slcl <=", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclLike(String value) {
            addCriterion("zyxh_slcl like", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclNotLike(String value) {
            addCriterion("zyxh_slcl not like", value, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclIn(List<String> values) {
            addCriterion("zyxh_slcl in", values, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclNotIn(List<String> values) {
            addCriterion("zyxh_slcl not in", values, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclBetween(String value1, String value2) {
            addCriterion("zyxh_slcl between", value1, value2, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlclNotBetween(String value1, String value2) {
            addCriterion("zyxh_slcl not between", value1, value2, "zyxhSlcl");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0IsNull() {
            addCriterion("zyxh_sl_yclName_0 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0IsNotNull() {
            addCriterion("zyxh_sl_yclName_0 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_0 =", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_0 <>", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_0 >", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_0 >=", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0LessThan(String value) {
            addCriterion("zyxh_sl_yclName_0 <", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_0 <=", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0Like(String value) {
            addCriterion("zyxh_sl_yclName_0 like", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0NotLike(String value) {
            addCriterion("zyxh_sl_yclName_0 not like", value, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0In(List<String> values) {
            addCriterion("zyxh_sl_yclName_0 in", values, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_0 not in", values, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_0 between", value1, value2, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname0NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_0 not between", value1, value2, "zyxhSlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1IsNull() {
            addCriterion("zyxh_sl_yclName_1 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1IsNotNull() {
            addCriterion("zyxh_sl_yclName_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_1 =", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_1 <>", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_1 >", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_1 >=", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1LessThan(String value) {
            addCriterion("zyxh_sl_yclName_1 <", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_1 <=", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1Like(String value) {
            addCriterion("zyxh_sl_yclName_1 like", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1NotLike(String value) {
            addCriterion("zyxh_sl_yclName_1 not like", value, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1In(List<String> values) {
            addCriterion("zyxh_sl_yclName_1 in", values, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_1 not in", values, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_1 between", value1, value2, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname1NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_1 not between", value1, value2, "zyxhSlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2IsNull() {
            addCriterion("zyxh_sl_yclName_2 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2IsNotNull() {
            addCriterion("zyxh_sl_yclName_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_2 =", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_2 <>", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_2 >", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_2 >=", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2LessThan(String value) {
            addCriterion("zyxh_sl_yclName_2 <", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_2 <=", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2Like(String value) {
            addCriterion("zyxh_sl_yclName_2 like", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2NotLike(String value) {
            addCriterion("zyxh_sl_yclName_2 not like", value, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2In(List<String> values) {
            addCriterion("zyxh_sl_yclName_2 in", values, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_2 not in", values, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_2 between", value1, value2, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname2NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_2 not between", value1, value2, "zyxhSlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3IsNull() {
            addCriterion("zyxh_sl_yclName_3 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3IsNotNull() {
            addCriterion("zyxh_sl_yclName_3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_3 =", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_3 <>", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_3 >", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_3 >=", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3LessThan(String value) {
            addCriterion("zyxh_sl_yclName_3 <", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_3 <=", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3Like(String value) {
            addCriterion("zyxh_sl_yclName_3 like", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3NotLike(String value) {
            addCriterion("zyxh_sl_yclName_3 not like", value, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3In(List<String> values) {
            addCriterion("zyxh_sl_yclName_3 in", values, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_3 not in", values, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_3 between", value1, value2, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname3NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_3 not between", value1, value2, "zyxhSlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4IsNull() {
            addCriterion("zyxh_sl_yclName_4 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4IsNotNull() {
            addCriterion("zyxh_sl_yclName_4 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_4 =", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_4 <>", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_4 >", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_4 >=", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4LessThan(String value) {
            addCriterion("zyxh_sl_yclName_4 <", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_4 <=", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4Like(String value) {
            addCriterion("zyxh_sl_yclName_4 like", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4NotLike(String value) {
            addCriterion("zyxh_sl_yclName_4 not like", value, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4In(List<String> values) {
            addCriterion("zyxh_sl_yclName_4 in", values, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_4 not in", values, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_4 between", value1, value2, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname4NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_4 not between", value1, value2, "zyxhSlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5IsNull() {
            addCriterion("zyxh_sl_yclName_5 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5IsNotNull() {
            addCriterion("zyxh_sl_yclName_5 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_5 =", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_5 <>", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_5 >", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_5 >=", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5LessThan(String value) {
            addCriterion("zyxh_sl_yclName_5 <", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_5 <=", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5Like(String value) {
            addCriterion("zyxh_sl_yclName_5 like", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5NotLike(String value) {
            addCriterion("zyxh_sl_yclName_5 not like", value, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5In(List<String> values) {
            addCriterion("zyxh_sl_yclName_5 in", values, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_5 not in", values, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_5 between", value1, value2, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname5NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_5 not between", value1, value2, "zyxhSlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6IsNull() {
            addCriterion("zyxh_sl_yclName_6 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6IsNotNull() {
            addCriterion("zyxh_sl_yclName_6 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_6 =", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_6 <>", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_6 >", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_6 >=", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6LessThan(String value) {
            addCriterion("zyxh_sl_yclName_6 <", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_6 <=", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6Like(String value) {
            addCriterion("zyxh_sl_yclName_6 like", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6NotLike(String value) {
            addCriterion("zyxh_sl_yclName_6 not like", value, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6In(List<String> values) {
            addCriterion("zyxh_sl_yclName_6 in", values, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_6 not in", values, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_6 between", value1, value2, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname6NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_6 not between", value1, value2, "zyxhSlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7IsNull() {
            addCriterion("zyxh_sl_yclName_7 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7IsNotNull() {
            addCriterion("zyxh_sl_yclName_7 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_7 =", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_7 <>", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_7 >", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_7 >=", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7LessThan(String value) {
            addCriterion("zyxh_sl_yclName_7 <", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_7 <=", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7Like(String value) {
            addCriterion("zyxh_sl_yclName_7 like", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7NotLike(String value) {
            addCriterion("zyxh_sl_yclName_7 not like", value, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7In(List<String> values) {
            addCriterion("zyxh_sl_yclName_7 in", values, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_7 not in", values, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_7 between", value1, value2, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname7NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_7 not between", value1, value2, "zyxhSlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8IsNull() {
            addCriterion("zyxh_sl_yclName_8 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8IsNotNull() {
            addCriterion("zyxh_sl_yclName_8 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_8 =", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_8 <>", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_8 >", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_8 >=", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8LessThan(String value) {
            addCriterion("zyxh_sl_yclName_8 <", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_8 <=", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8Like(String value) {
            addCriterion("zyxh_sl_yclName_8 like", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8NotLike(String value) {
            addCriterion("zyxh_sl_yclName_8 not like", value, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8In(List<String> values) {
            addCriterion("zyxh_sl_yclName_8 in", values, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_8 not in", values, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_8 between", value1, value2, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname8NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_8 not between", value1, value2, "zyxhSlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9IsNull() {
            addCriterion("zyxh_sl_yclName_9 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9IsNotNull() {
            addCriterion("zyxh_sl_yclName_9 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_9 =", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_9 <>", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_9 >", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_9 >=", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9LessThan(String value) {
            addCriterion("zyxh_sl_yclName_9 <", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_9 <=", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9Like(String value) {
            addCriterion("zyxh_sl_yclName_9 like", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9NotLike(String value) {
            addCriterion("zyxh_sl_yclName_9 not like", value, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9In(List<String> values) {
            addCriterion("zyxh_sl_yclName_9 in", values, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_9 not in", values, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_9 between", value1, value2, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname9NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_9 not between", value1, value2, "zyxhSlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10IsNull() {
            addCriterion("zyxh_sl_yclName_10 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10IsNotNull() {
            addCriterion("zyxh_sl_yclName_10 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_10 =", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_10 <>", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_10 >", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_10 >=", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10LessThan(String value) {
            addCriterion("zyxh_sl_yclName_10 <", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_10 <=", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10Like(String value) {
            addCriterion("zyxh_sl_yclName_10 like", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10NotLike(String value) {
            addCriterion("zyxh_sl_yclName_10 not like", value, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10In(List<String> values) {
            addCriterion("zyxh_sl_yclName_10 in", values, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_10 not in", values, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_10 between", value1, value2, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname10NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_10 not between", value1, value2, "zyxhSlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11IsNull() {
            addCriterion("zyxh_sl_yclName_11 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11IsNotNull() {
            addCriterion("zyxh_sl_yclName_11 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_11 =", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_11 <>", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_11 >", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_11 >=", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11LessThan(String value) {
            addCriterion("zyxh_sl_yclName_11 <", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_11 <=", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11Like(String value) {
            addCriterion("zyxh_sl_yclName_11 like", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11NotLike(String value) {
            addCriterion("zyxh_sl_yclName_11 not like", value, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11In(List<String> values) {
            addCriterion("zyxh_sl_yclName_11 in", values, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_11 not in", values, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_11 between", value1, value2, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname11NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_11 not between", value1, value2, "zyxhSlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12IsNull() {
            addCriterion("zyxh_sl_yclName_12 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12IsNotNull() {
            addCriterion("zyxh_sl_yclName_12 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_12 =", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_12 <>", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_12 >", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_12 >=", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12LessThan(String value) {
            addCriterion("zyxh_sl_yclName_12 <", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_12 <=", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12Like(String value) {
            addCriterion("zyxh_sl_yclName_12 like", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12NotLike(String value) {
            addCriterion("zyxh_sl_yclName_12 not like", value, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12In(List<String> values) {
            addCriterion("zyxh_sl_yclName_12 in", values, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_12 not in", values, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_12 between", value1, value2, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname12NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_12 not between", value1, value2, "zyxhSlYclname12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13IsNull() {
            addCriterion("zyxh_sl_yclName_13 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13IsNotNull() {
            addCriterion("zyxh_sl_yclName_13 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_13 =", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_13 <>", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_13 >", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_13 >=", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13LessThan(String value) {
            addCriterion("zyxh_sl_yclName_13 <", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_13 <=", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13Like(String value) {
            addCriterion("zyxh_sl_yclName_13 like", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13NotLike(String value) {
            addCriterion("zyxh_sl_yclName_13 not like", value, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13In(List<String> values) {
            addCriterion("zyxh_sl_yclName_13 in", values, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_13 not in", values, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_13 between", value1, value2, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname13NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_13 not between", value1, value2, "zyxhSlYclname13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14IsNull() {
            addCriterion("zyxh_sl_yclName_14 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14IsNotNull() {
            addCriterion("zyxh_sl_yclName_14 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_14 =", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_14 <>", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_14 >", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_14 >=", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14LessThan(String value) {
            addCriterion("zyxh_sl_yclName_14 <", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_14 <=", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14Like(String value) {
            addCriterion("zyxh_sl_yclName_14 like", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14NotLike(String value) {
            addCriterion("zyxh_sl_yclName_14 not like", value, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14In(List<String> values) {
            addCriterion("zyxh_sl_yclName_14 in", values, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_14 not in", values, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_14 between", value1, value2, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname14NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_14 not between", value1, value2, "zyxhSlYclname14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15IsNull() {
            addCriterion("zyxh_sl_yclName_15 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15IsNotNull() {
            addCriterion("zyxh_sl_yclName_15 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_15 =", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_15 <>", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_15 >", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_15 >=", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15LessThan(String value) {
            addCriterion("zyxh_sl_yclName_15 <", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_15 <=", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15Like(String value) {
            addCriterion("zyxh_sl_yclName_15 like", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15NotLike(String value) {
            addCriterion("zyxh_sl_yclName_15 not like", value, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15In(List<String> values) {
            addCriterion("zyxh_sl_yclName_15 in", values, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_15 not in", values, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_15 between", value1, value2, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname15NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_15 not between", value1, value2, "zyxhSlYclname15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16IsNull() {
            addCriterion("zyxh_sl_yclName_16 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16IsNotNull() {
            addCriterion("zyxh_sl_yclName_16 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_16 =", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_16 <>", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_16 >", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_16 >=", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16LessThan(String value) {
            addCriterion("zyxh_sl_yclName_16 <", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_16 <=", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16Like(String value) {
            addCriterion("zyxh_sl_yclName_16 like", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16NotLike(String value) {
            addCriterion("zyxh_sl_yclName_16 not like", value, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16In(List<String> values) {
            addCriterion("zyxh_sl_yclName_16 in", values, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_16 not in", values, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_16 between", value1, value2, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname16NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_16 not between", value1, value2, "zyxhSlYclname16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17IsNull() {
            addCriterion("zyxh_sl_yclName_17 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17IsNotNull() {
            addCriterion("zyxh_sl_yclName_17 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_17 =", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_17 <>", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_17 >", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_17 >=", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17LessThan(String value) {
            addCriterion("zyxh_sl_yclName_17 <", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_17 <=", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17Like(String value) {
            addCriterion("zyxh_sl_yclName_17 like", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17NotLike(String value) {
            addCriterion("zyxh_sl_yclName_17 not like", value, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17In(List<String> values) {
            addCriterion("zyxh_sl_yclName_17 in", values, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_17 not in", values, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_17 between", value1, value2, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname17NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_17 not between", value1, value2, "zyxhSlYclname17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18IsNull() {
            addCriterion("zyxh_sl_yclName_18 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18IsNotNull() {
            addCriterion("zyxh_sl_yclName_18 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_18 =", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_18 <>", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_18 >", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_18 >=", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18LessThan(String value) {
            addCriterion("zyxh_sl_yclName_18 <", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_18 <=", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18Like(String value) {
            addCriterion("zyxh_sl_yclName_18 like", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18NotLike(String value) {
            addCriterion("zyxh_sl_yclName_18 not like", value, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18In(List<String> values) {
            addCriterion("zyxh_sl_yclName_18 in", values, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_18 not in", values, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_18 between", value1, value2, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname18NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_18 not between", value1, value2, "zyxhSlYclname18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19IsNull() {
            addCriterion("zyxh_sl_yclName_19 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19IsNotNull() {
            addCriterion("zyxh_sl_yclName_19 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_19 =", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_19 <>", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_19 >", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_19 >=", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19LessThan(String value) {
            addCriterion("zyxh_sl_yclName_19 <", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_19 <=", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19Like(String value) {
            addCriterion("zyxh_sl_yclName_19 like", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19NotLike(String value) {
            addCriterion("zyxh_sl_yclName_19 not like", value, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19In(List<String> values) {
            addCriterion("zyxh_sl_yclName_19 in", values, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_19 not in", values, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_19 between", value1, value2, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname19NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_19 not between", value1, value2, "zyxhSlYclname19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20IsNull() {
            addCriterion("zyxh_sl_yclName_20 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20IsNotNull() {
            addCriterion("zyxh_sl_yclName_20 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_20 =", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_20 <>", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_20 >", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_20 >=", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20LessThan(String value) {
            addCriterion("zyxh_sl_yclName_20 <", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_20 <=", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20Like(String value) {
            addCriterion("zyxh_sl_yclName_20 like", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20NotLike(String value) {
            addCriterion("zyxh_sl_yclName_20 not like", value, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20In(List<String> values) {
            addCriterion("zyxh_sl_yclName_20 in", values, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_20 not in", values, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_20 between", value1, value2, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname20NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_20 not between", value1, value2, "zyxhSlYclname20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21IsNull() {
            addCriterion("zyxh_sl_yclName_21 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21IsNotNull() {
            addCriterion("zyxh_sl_yclName_21 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_21 =", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_21 <>", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_21 >", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_21 >=", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21LessThan(String value) {
            addCriterion("zyxh_sl_yclName_21 <", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_21 <=", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21Like(String value) {
            addCriterion("zyxh_sl_yclName_21 like", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21NotLike(String value) {
            addCriterion("zyxh_sl_yclName_21 not like", value, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21In(List<String> values) {
            addCriterion("zyxh_sl_yclName_21 in", values, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_21 not in", values, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_21 between", value1, value2, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname21NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_21 not between", value1, value2, "zyxhSlYclname21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22IsNull() {
            addCriterion("zyxh_sl_yclName_22 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22IsNotNull() {
            addCriterion("zyxh_sl_yclName_22 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_22 =", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_22 <>", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_22 >", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_22 >=", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22LessThan(String value) {
            addCriterion("zyxh_sl_yclName_22 <", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_22 <=", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22Like(String value) {
            addCriterion("zyxh_sl_yclName_22 like", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22NotLike(String value) {
            addCriterion("zyxh_sl_yclName_22 not like", value, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22In(List<String> values) {
            addCriterion("zyxh_sl_yclName_22 in", values, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_22 not in", values, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_22 between", value1, value2, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname22NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_22 not between", value1, value2, "zyxhSlYclname22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23IsNull() {
            addCriterion("zyxh_sl_yclName_23 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23IsNotNull() {
            addCriterion("zyxh_sl_yclName_23 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_23 =", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_23 <>", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_23 >", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_23 >=", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23LessThan(String value) {
            addCriterion("zyxh_sl_yclName_23 <", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_23 <=", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23Like(String value) {
            addCriterion("zyxh_sl_yclName_23 like", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23NotLike(String value) {
            addCriterion("zyxh_sl_yclName_23 not like", value, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23In(List<String> values) {
            addCriterion("zyxh_sl_yclName_23 in", values, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_23 not in", values, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_23 between", value1, value2, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname23NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_23 not between", value1, value2, "zyxhSlYclname23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24IsNull() {
            addCriterion("zyxh_sl_yclName_24 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24IsNotNull() {
            addCriterion("zyxh_sl_yclName_24 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_24 =", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_24 <>", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_24 >", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_24 >=", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24LessThan(String value) {
            addCriterion("zyxh_sl_yclName_24 <", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_24 <=", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24Like(String value) {
            addCriterion("zyxh_sl_yclName_24 like", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24NotLike(String value) {
            addCriterion("zyxh_sl_yclName_24 not like", value, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24In(List<String> values) {
            addCriterion("zyxh_sl_yclName_24 in", values, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_24 not in", values, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_24 between", value1, value2, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname24NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_24 not between", value1, value2, "zyxhSlYclname24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25IsNull() {
            addCriterion("zyxh_sl_yclName_25 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25IsNotNull() {
            addCriterion("zyxh_sl_yclName_25 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_25 =", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_25 <>", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_25 >", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_25 >=", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25LessThan(String value) {
            addCriterion("zyxh_sl_yclName_25 <", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_25 <=", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25Like(String value) {
            addCriterion("zyxh_sl_yclName_25 like", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25NotLike(String value) {
            addCriterion("zyxh_sl_yclName_25 not like", value, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25In(List<String> values) {
            addCriterion("zyxh_sl_yclName_25 in", values, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_25 not in", values, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_25 between", value1, value2, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname25NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_25 not between", value1, value2, "zyxhSlYclname25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26IsNull() {
            addCriterion("zyxh_sl_yclName_26 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26IsNotNull() {
            addCriterion("zyxh_sl_yclName_26 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_26 =", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_26 <>", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_26 >", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_26 >=", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26LessThan(String value) {
            addCriterion("zyxh_sl_yclName_26 <", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_26 <=", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26Like(String value) {
            addCriterion("zyxh_sl_yclName_26 like", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26NotLike(String value) {
            addCriterion("zyxh_sl_yclName_26 not like", value, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26In(List<String> values) {
            addCriterion("zyxh_sl_yclName_26 in", values, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_26 not in", values, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_26 between", value1, value2, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname26NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_26 not between", value1, value2, "zyxhSlYclname26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27IsNull() {
            addCriterion("zyxh_sl_yclName_27 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27IsNotNull() {
            addCriterion("zyxh_sl_yclName_27 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_27 =", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_27 <>", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_27 >", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_27 >=", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27LessThan(String value) {
            addCriterion("zyxh_sl_yclName_27 <", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_27 <=", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27Like(String value) {
            addCriterion("zyxh_sl_yclName_27 like", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27NotLike(String value) {
            addCriterion("zyxh_sl_yclName_27 not like", value, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27In(List<String> values) {
            addCriterion("zyxh_sl_yclName_27 in", values, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_27 not in", values, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_27 between", value1, value2, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname27NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_27 not between", value1, value2, "zyxhSlYclname27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28IsNull() {
            addCriterion("zyxh_sl_yclName_28 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28IsNotNull() {
            addCriterion("zyxh_sl_yclName_28 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_28 =", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_28 <>", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_28 >", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_28 >=", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28LessThan(String value) {
            addCriterion("zyxh_sl_yclName_28 <", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_28 <=", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28Like(String value) {
            addCriterion("zyxh_sl_yclName_28 like", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28NotLike(String value) {
            addCriterion("zyxh_sl_yclName_28 not like", value, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28In(List<String> values) {
            addCriterion("zyxh_sl_yclName_28 in", values, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_28 not in", values, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_28 between", value1, value2, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname28NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_28 not between", value1, value2, "zyxhSlYclname28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29IsNull() {
            addCriterion("zyxh_sl_yclName_29 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29IsNotNull() {
            addCriterion("zyxh_sl_yclName_29 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29EqualTo(String value) {
            addCriterion("zyxh_sl_yclName_29 =", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_29 <>", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29GreaterThan(String value) {
            addCriterion("zyxh_sl_yclName_29 >", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_29 >=", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29LessThan(String value) {
            addCriterion("zyxh_sl_yclName_29 <", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclName_29 <=", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29Like(String value) {
            addCriterion("zyxh_sl_yclName_29 like", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29NotLike(String value) {
            addCriterion("zyxh_sl_yclName_29 not like", value, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29In(List<String> values) {
            addCriterion("zyxh_sl_yclName_29 in", values, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclName_29 not in", values, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_29 between", value1, value2, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclname29NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclName_29 not between", value1, value2, "zyxhSlYclname29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0IsNull() {
            addCriterion("zyxh_sl_yclXhqk_0 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_0 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 =", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 <>", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 >", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 >=", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 <", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 <=", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 like", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_0 not like", value, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_0 in", values, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_0 not in", values, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_0 between", value1, value2, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk0NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_0 not between", value1, value2, "zyxhSlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1IsNull() {
            addCriterion("zyxh_sl_yclXhqk_1 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 =", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 <>", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 >", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 >=", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 <", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 <=", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 like", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_1 not like", value, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_1 in", values, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_1 not in", values, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_1 between", value1, value2, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk1NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_1 not between", value1, value2, "zyxhSlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2IsNull() {
            addCriterion("zyxh_sl_yclXhqk_2 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 =", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 <>", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 >", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 >=", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 <", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 <=", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 like", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_2 not like", value, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_2 in", values, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_2 not in", values, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_2 between", value1, value2, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk2NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_2 not between", value1, value2, "zyxhSlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3IsNull() {
            addCriterion("zyxh_sl_yclXhqk_3 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 =", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 <>", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 >", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 >=", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 <", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 <=", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 like", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_3 not like", value, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_3 in", values, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_3 not in", values, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_3 between", value1, value2, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk3NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_3 not between", value1, value2, "zyxhSlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4IsNull() {
            addCriterion("zyxh_sl_yclXhqk_4 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_4 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 =", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 <>", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 >", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 >=", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 <", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 <=", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 like", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_4 not like", value, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_4 in", values, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_4 not in", values, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_4 between", value1, value2, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk4NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_4 not between", value1, value2, "zyxhSlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5IsNull() {
            addCriterion("zyxh_sl_yclXhqk_5 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_5 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 =", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 <>", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 >", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 >=", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 <", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 <=", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 like", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_5 not like", value, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_5 in", values, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_5 not in", values, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_5 between", value1, value2, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk5NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_5 not between", value1, value2, "zyxhSlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6IsNull() {
            addCriterion("zyxh_sl_yclXhqk_6 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_6 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 =", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 <>", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 >", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 >=", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 <", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 <=", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 like", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_6 not like", value, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_6 in", values, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_6 not in", values, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_6 between", value1, value2, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk6NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_6 not between", value1, value2, "zyxhSlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7IsNull() {
            addCriterion("zyxh_sl_yclXhqk_7 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_7 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 =", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 <>", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 >", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 >=", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 <", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 <=", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 like", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_7 not like", value, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_7 in", values, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_7 not in", values, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_7 between", value1, value2, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk7NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_7 not between", value1, value2, "zyxhSlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8IsNull() {
            addCriterion("zyxh_sl_yclXhqk_8 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_8 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 =", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 <>", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 >", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 >=", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 <", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 <=", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 like", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_8 not like", value, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_8 in", values, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_8 not in", values, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_8 between", value1, value2, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk8NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_8 not between", value1, value2, "zyxhSlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9IsNull() {
            addCriterion("zyxh_sl_yclXhqk_9 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_9 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 =", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 <>", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 >", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 >=", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 <", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 <=", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 like", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_9 not like", value, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_9 in", values, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_9 not in", values, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_9 between", value1, value2, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk9NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_9 not between", value1, value2, "zyxhSlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10IsNull() {
            addCriterion("zyxh_sl_yclXhqk_10 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_10 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 =", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 <>", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 >", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 >=", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 <", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 <=", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 like", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_10 not like", value, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_10 in", values, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_10 not in", values, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_10 between", value1, value2, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk10NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_10 not between", value1, value2, "zyxhSlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11IsNull() {
            addCriterion("zyxh_sl_yclXhqk_11 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_11 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 =", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 <>", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 >", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 >=", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 <", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 <=", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 like", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_11 not like", value, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_11 in", values, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_11 not in", values, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_11 between", value1, value2, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk11NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_11 not between", value1, value2, "zyxhSlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12IsNull() {
            addCriterion("zyxh_sl_yclXhqk_12 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_12 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 =", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 <>", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 >", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 >=", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 <", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 <=", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 like", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_12 not like", value, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_12 in", values, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_12 not in", values, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_12 between", value1, value2, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk12NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_12 not between", value1, value2, "zyxhSlYclxhqk12");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13IsNull() {
            addCriterion("zyxh_sl_yclXhqk_13 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_13 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 =", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 <>", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 >", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 >=", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 <", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 <=", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 like", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_13 not like", value, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_13 in", values, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_13 not in", values, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_13 between", value1, value2, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk13NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_13 not between", value1, value2, "zyxhSlYclxhqk13");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14IsNull() {
            addCriterion("zyxh_sl_yclXhqk_14 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_14 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 =", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 <>", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 >", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 >=", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 <", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 <=", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 like", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_14 not like", value, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_14 in", values, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_14 not in", values, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_14 between", value1, value2, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk14NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_14 not between", value1, value2, "zyxhSlYclxhqk14");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15IsNull() {
            addCriterion("zyxh_sl_yclXhqk_15 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_15 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 =", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 <>", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 >", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 >=", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 <", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 <=", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 like", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_15 not like", value, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_15 in", values, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_15 not in", values, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_15 between", value1, value2, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk15NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_15 not between", value1, value2, "zyxhSlYclxhqk15");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16IsNull() {
            addCriterion("zyxh_sl_yclXhqk_16 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_16 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 =", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 <>", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 >", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 >=", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 <", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 <=", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 like", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_16 not like", value, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_16 in", values, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_16 not in", values, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_16 between", value1, value2, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk16NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_16 not between", value1, value2, "zyxhSlYclxhqk16");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17IsNull() {
            addCriterion("zyxh_sl_yclXhqk_17 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_17 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 =", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 <>", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 >", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 >=", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 <", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 <=", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 like", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_17 not like", value, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_17 in", values, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_17 not in", values, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_17 between", value1, value2, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk17NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_17 not between", value1, value2, "zyxhSlYclxhqk17");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18IsNull() {
            addCriterion("zyxh_sl_yclXhqk_18 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_18 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 =", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 <>", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 >", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 >=", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 <", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 <=", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 like", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_18 not like", value, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_18 in", values, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_18 not in", values, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_18 between", value1, value2, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk18NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_18 not between", value1, value2, "zyxhSlYclxhqk18");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19IsNull() {
            addCriterion("zyxh_sl_yclXhqk_19 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_19 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 =", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 <>", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 >", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 >=", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 <", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 <=", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 like", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_19 not like", value, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_19 in", values, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_19 not in", values, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_19 between", value1, value2, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk19NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_19 not between", value1, value2, "zyxhSlYclxhqk19");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20IsNull() {
            addCriterion("zyxh_sl_yclXhqk_20 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_20 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 =", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 <>", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 >", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 >=", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 <", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 <=", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 like", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_20 not like", value, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_20 in", values, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_20 not in", values, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_20 between", value1, value2, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk20NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_20 not between", value1, value2, "zyxhSlYclxhqk20");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21IsNull() {
            addCriterion("zyxh_sl_yclXhqk_21 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_21 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 =", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 <>", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 >", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 >=", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 <", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 <=", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 like", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_21 not like", value, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_21 in", values, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_21 not in", values, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_21 between", value1, value2, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk21NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_21 not between", value1, value2, "zyxhSlYclxhqk21");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22IsNull() {
            addCriterion("zyxh_sl_yclXhqk_22 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_22 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 =", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 <>", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 >", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 >=", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 <", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 <=", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 like", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_22 not like", value, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_22 in", values, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_22 not in", values, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_22 between", value1, value2, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk22NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_22 not between", value1, value2, "zyxhSlYclxhqk22");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23IsNull() {
            addCriterion("zyxh_sl_yclXhqk_23 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_23 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 =", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 <>", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 >", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 >=", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 <", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 <=", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 like", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_23 not like", value, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_23 in", values, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_23 not in", values, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_23 between", value1, value2, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk23NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_23 not between", value1, value2, "zyxhSlYclxhqk23");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24IsNull() {
            addCriterion("zyxh_sl_yclXhqk_24 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_24 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 =", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 <>", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 >", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 >=", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 <", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 <=", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 like", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_24 not like", value, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_24 in", values, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_24 not in", values, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_24 between", value1, value2, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk24NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_24 not between", value1, value2, "zyxhSlYclxhqk24");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25IsNull() {
            addCriterion("zyxh_sl_yclXhqk_25 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_25 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 =", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 <>", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 >", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 >=", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 <", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 <=", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 like", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_25 not like", value, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_25 in", values, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_25 not in", values, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_25 between", value1, value2, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk25NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_25 not between", value1, value2, "zyxhSlYclxhqk25");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26IsNull() {
            addCriterion("zyxh_sl_yclXhqk_26 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_26 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 =", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 <>", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 >", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 >=", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 <", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 <=", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 like", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_26 not like", value, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_26 in", values, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_26 not in", values, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_26 between", value1, value2, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk26NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_26 not between", value1, value2, "zyxhSlYclxhqk26");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27IsNull() {
            addCriterion("zyxh_sl_yclXhqk_27 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_27 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 =", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 <>", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 >", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 >=", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 <", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 <=", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 like", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_27 not like", value, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_27 in", values, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_27 not in", values, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_27 between", value1, value2, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk27NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_27 not between", value1, value2, "zyxhSlYclxhqk27");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28IsNull() {
            addCriterion("zyxh_sl_yclXhqk_28 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_28 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 =", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 <>", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 >", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 >=", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 <", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 <=", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 like", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_28 not like", value, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_28 in", values, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_28 not in", values, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_28 between", value1, value2, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk28NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_28 not between", value1, value2, "zyxhSlYclxhqk28");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29IsNull() {
            addCriterion("zyxh_sl_yclXhqk_29 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29IsNotNull() {
            addCriterion("zyxh_sl_yclXhqk_29 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29EqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 =", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29NotEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 <>", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29GreaterThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 >", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 >=", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29LessThan(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 <", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29LessThanOrEqualTo(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 <=", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29Like(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 like", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29NotLike(String value) {
            addCriterion("zyxh_sl_yclXhqk_29 not like", value, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29In(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_29 in", values, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29NotIn(List<String> values) {
            addCriterion("zyxh_sl_yclXhqk_29 not in", values, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29Between(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_29 between", value1, value2, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhSlYclxhqk29NotBetween(String value1, String value2) {
            addCriterion("zyxh_sl_yclXhqk_29 not between", value1, value2, "zyxhSlYclxhqk29");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0IsNull() {
            addCriterion("zyxh_rl_yclName_0 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0IsNotNull() {
            addCriterion("zyxh_rl_yclName_0 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_0 =", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_0 <>", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_0 >", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_0 >=", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0LessThan(String value) {
            addCriterion("zyxh_rl_yclName_0 <", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_0 <=", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0Like(String value) {
            addCriterion("zyxh_rl_yclName_0 like", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0NotLike(String value) {
            addCriterion("zyxh_rl_yclName_0 not like", value, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0In(List<String> values) {
            addCriterion("zyxh_rl_yclName_0 in", values, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_0 not in", values, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_0 between", value1, value2, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname0NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_0 not between", value1, value2, "zyxhRlYclname0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1IsNull() {
            addCriterion("zyxh_rl_yclName_1 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1IsNotNull() {
            addCriterion("zyxh_rl_yclName_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_1 =", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_1 <>", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_1 >", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_1 >=", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1LessThan(String value) {
            addCriterion("zyxh_rl_yclName_1 <", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_1 <=", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1Like(String value) {
            addCriterion("zyxh_rl_yclName_1 like", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1NotLike(String value) {
            addCriterion("zyxh_rl_yclName_1 not like", value, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1In(List<String> values) {
            addCriterion("zyxh_rl_yclName_1 in", values, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_1 not in", values, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_1 between", value1, value2, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname1NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_1 not between", value1, value2, "zyxhRlYclname1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2IsNull() {
            addCriterion("zyxh_rl_yclName_2 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2IsNotNull() {
            addCriterion("zyxh_rl_yclName_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_2 =", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_2 <>", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_2 >", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_2 >=", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2LessThan(String value) {
            addCriterion("zyxh_rl_yclName_2 <", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_2 <=", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2Like(String value) {
            addCriterion("zyxh_rl_yclName_2 like", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2NotLike(String value) {
            addCriterion("zyxh_rl_yclName_2 not like", value, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2In(List<String> values) {
            addCriterion("zyxh_rl_yclName_2 in", values, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_2 not in", values, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_2 between", value1, value2, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname2NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_2 not between", value1, value2, "zyxhRlYclname2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3IsNull() {
            addCriterion("zyxh_rl_yclName_3 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3IsNotNull() {
            addCriterion("zyxh_rl_yclName_3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_3 =", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_3 <>", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_3 >", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_3 >=", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3LessThan(String value) {
            addCriterion("zyxh_rl_yclName_3 <", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_3 <=", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3Like(String value) {
            addCriterion("zyxh_rl_yclName_3 like", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3NotLike(String value) {
            addCriterion("zyxh_rl_yclName_3 not like", value, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3In(List<String> values) {
            addCriterion("zyxh_rl_yclName_3 in", values, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_3 not in", values, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_3 between", value1, value2, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname3NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_3 not between", value1, value2, "zyxhRlYclname3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4IsNull() {
            addCriterion("zyxh_rl_yclName_4 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4IsNotNull() {
            addCriterion("zyxh_rl_yclName_4 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_4 =", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_4 <>", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_4 >", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_4 >=", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4LessThan(String value) {
            addCriterion("zyxh_rl_yclName_4 <", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_4 <=", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4Like(String value) {
            addCriterion("zyxh_rl_yclName_4 like", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4NotLike(String value) {
            addCriterion("zyxh_rl_yclName_4 not like", value, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4In(List<String> values) {
            addCriterion("zyxh_rl_yclName_4 in", values, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_4 not in", values, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_4 between", value1, value2, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname4NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_4 not between", value1, value2, "zyxhRlYclname4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5IsNull() {
            addCriterion("zyxh_rl_yclName_5 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5IsNotNull() {
            addCriterion("zyxh_rl_yclName_5 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_5 =", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_5 <>", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_5 >", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_5 >=", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5LessThan(String value) {
            addCriterion("zyxh_rl_yclName_5 <", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_5 <=", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5Like(String value) {
            addCriterion("zyxh_rl_yclName_5 like", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5NotLike(String value) {
            addCriterion("zyxh_rl_yclName_5 not like", value, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5In(List<String> values) {
            addCriterion("zyxh_rl_yclName_5 in", values, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_5 not in", values, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_5 between", value1, value2, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname5NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_5 not between", value1, value2, "zyxhRlYclname5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6IsNull() {
            addCriterion("zyxh_rl_yclName_6 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6IsNotNull() {
            addCriterion("zyxh_rl_yclName_6 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_6 =", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_6 <>", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_6 >", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_6 >=", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6LessThan(String value) {
            addCriterion("zyxh_rl_yclName_6 <", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_6 <=", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6Like(String value) {
            addCriterion("zyxh_rl_yclName_6 like", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6NotLike(String value) {
            addCriterion("zyxh_rl_yclName_6 not like", value, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6In(List<String> values) {
            addCriterion("zyxh_rl_yclName_6 in", values, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_6 not in", values, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_6 between", value1, value2, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname6NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_6 not between", value1, value2, "zyxhRlYclname6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7IsNull() {
            addCriterion("zyxh_rl_yclName_7 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7IsNotNull() {
            addCriterion("zyxh_rl_yclName_7 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_7 =", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_7 <>", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_7 >", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_7 >=", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7LessThan(String value) {
            addCriterion("zyxh_rl_yclName_7 <", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_7 <=", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7Like(String value) {
            addCriterion("zyxh_rl_yclName_7 like", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7NotLike(String value) {
            addCriterion("zyxh_rl_yclName_7 not like", value, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7In(List<String> values) {
            addCriterion("zyxh_rl_yclName_7 in", values, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_7 not in", values, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_7 between", value1, value2, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname7NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_7 not between", value1, value2, "zyxhRlYclname7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8IsNull() {
            addCriterion("zyxh_rl_yclName_8 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8IsNotNull() {
            addCriterion("zyxh_rl_yclName_8 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_8 =", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_8 <>", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_8 >", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_8 >=", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8LessThan(String value) {
            addCriterion("zyxh_rl_yclName_8 <", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_8 <=", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8Like(String value) {
            addCriterion("zyxh_rl_yclName_8 like", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8NotLike(String value) {
            addCriterion("zyxh_rl_yclName_8 not like", value, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8In(List<String> values) {
            addCriterion("zyxh_rl_yclName_8 in", values, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_8 not in", values, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_8 between", value1, value2, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname8NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_8 not between", value1, value2, "zyxhRlYclname8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9IsNull() {
            addCriterion("zyxh_rl_yclName_9 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9IsNotNull() {
            addCriterion("zyxh_rl_yclName_9 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_9 =", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_9 <>", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_9 >", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_9 >=", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9LessThan(String value) {
            addCriterion("zyxh_rl_yclName_9 <", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_9 <=", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9Like(String value) {
            addCriterion("zyxh_rl_yclName_9 like", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9NotLike(String value) {
            addCriterion("zyxh_rl_yclName_9 not like", value, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9In(List<String> values) {
            addCriterion("zyxh_rl_yclName_9 in", values, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_9 not in", values, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_9 between", value1, value2, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname9NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_9 not between", value1, value2, "zyxhRlYclname9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10IsNull() {
            addCriterion("zyxh_rl_yclName_10 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10IsNotNull() {
            addCriterion("zyxh_rl_yclName_10 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_10 =", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_10 <>", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_10 >", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_10 >=", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10LessThan(String value) {
            addCriterion("zyxh_rl_yclName_10 <", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_10 <=", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10Like(String value) {
            addCriterion("zyxh_rl_yclName_10 like", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10NotLike(String value) {
            addCriterion("zyxh_rl_yclName_10 not like", value, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10In(List<String> values) {
            addCriterion("zyxh_rl_yclName_10 in", values, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_10 not in", values, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_10 between", value1, value2, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname10NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_10 not between", value1, value2, "zyxhRlYclname10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11IsNull() {
            addCriterion("zyxh_rl_yclName_11 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11IsNotNull() {
            addCriterion("zyxh_rl_yclName_11 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11EqualTo(String value) {
            addCriterion("zyxh_rl_yclName_11 =", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_11 <>", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11GreaterThan(String value) {
            addCriterion("zyxh_rl_yclName_11 >", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_11 >=", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11LessThan(String value) {
            addCriterion("zyxh_rl_yclName_11 <", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclName_11 <=", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11Like(String value) {
            addCriterion("zyxh_rl_yclName_11 like", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11NotLike(String value) {
            addCriterion("zyxh_rl_yclName_11 not like", value, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11In(List<String> values) {
            addCriterion("zyxh_rl_yclName_11 in", values, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclName_11 not in", values, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_11 between", value1, value2, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclname11NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclName_11 not between", value1, value2, "zyxhRlYclname11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0IsNull() {
            addCriterion("zyxh_rl_yclXhqk_0 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_0 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 =", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 <>", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 >", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 >=", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 <", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 <=", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 like", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_0 not like", value, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_0 in", values, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_0 not in", values, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_0 between", value1, value2, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk0NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_0 not between", value1, value2, "zyxhRlYclxhqk0");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1IsNull() {
            addCriterion("zyxh_rl_yclXhqk_1 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 =", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 <>", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 >", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 >=", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 <", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 <=", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 like", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_1 not like", value, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_1 in", values, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_1 not in", values, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_1 between", value1, value2, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk1NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_1 not between", value1, value2, "zyxhRlYclxhqk1");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2IsNull() {
            addCriterion("zyxh_rl_yclXhqk_2 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 =", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 <>", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 >", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 >=", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 <", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 <=", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 like", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_2 not like", value, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_2 in", values, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_2 not in", values, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_2 between", value1, value2, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk2NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_2 not between", value1, value2, "zyxhRlYclxhqk2");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3IsNull() {
            addCriterion("zyxh_rl_yclXhqk_3 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 =", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 <>", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 >", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 >=", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 <", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 <=", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 like", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_3 not like", value, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_3 in", values, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_3 not in", values, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_3 between", value1, value2, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk3NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_3 not between", value1, value2, "zyxhRlYclxhqk3");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4IsNull() {
            addCriterion("zyxh_rl_yclXhqk_4 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_4 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 =", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 <>", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 >", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 >=", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 <", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 <=", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 like", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_4 not like", value, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_4 in", values, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_4 not in", values, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_4 between", value1, value2, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk4NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_4 not between", value1, value2, "zyxhRlYclxhqk4");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5IsNull() {
            addCriterion("zyxh_rl_yclXhqk_5 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_5 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 =", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 <>", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 >", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 >=", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 <", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 <=", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 like", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_5 not like", value, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_5 in", values, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_5 not in", values, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_5 between", value1, value2, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk5NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_5 not between", value1, value2, "zyxhRlYclxhqk5");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6IsNull() {
            addCriterion("zyxh_rl_yclXhqk_6 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_6 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 =", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 <>", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 >", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 >=", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 <", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 <=", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 like", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_6 not like", value, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_6 in", values, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_6 not in", values, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_6 between", value1, value2, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk6NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_6 not between", value1, value2, "zyxhRlYclxhqk6");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7IsNull() {
            addCriterion("zyxh_rl_yclXhqk_7 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_7 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 =", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 <>", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 >", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 >=", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 <", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 <=", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 like", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_7 not like", value, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_7 in", values, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_7 not in", values, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_7 between", value1, value2, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk7NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_7 not between", value1, value2, "zyxhRlYclxhqk7");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8IsNull() {
            addCriterion("zyxh_rl_yclXhqk_8 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_8 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 =", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 <>", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 >", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 >=", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 <", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 <=", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 like", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_8 not like", value, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_8 in", values, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_8 not in", values, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_8 between", value1, value2, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk8NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_8 not between", value1, value2, "zyxhRlYclxhqk8");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9IsNull() {
            addCriterion("zyxh_rl_yclXhqk_9 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_9 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 =", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 <>", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 >", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 >=", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 <", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 <=", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 like", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_9 not like", value, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_9 in", values, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_9 not in", values, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_9 between", value1, value2, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk9NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_9 not between", value1, value2, "zyxhRlYclxhqk9");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10IsNull() {
            addCriterion("zyxh_rl_yclXhqk_10 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_10 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 =", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 <>", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 >", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 >=", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 <", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 <=", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 like", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_10 not like", value, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_10 in", values, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_10 not in", values, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_10 between", value1, value2, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk10NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_10 not between", value1, value2, "zyxhRlYclxhqk10");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11IsNull() {
            addCriterion("zyxh_rl_yclXhqk_11 is null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11IsNotNull() {
            addCriterion("zyxh_rl_yclXhqk_11 is not null");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11EqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 =", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11NotEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 <>", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11GreaterThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 >", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11GreaterThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 >=", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11LessThan(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 <", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11LessThanOrEqualTo(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 <=", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11Like(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 like", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11NotLike(String value) {
            addCriterion("zyxh_rl_yclXhqk_11 not like", value, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11In(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_11 in", values, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11NotIn(List<String> values) {
            addCriterion("zyxh_rl_yclXhqk_11 not in", values, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11Between(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_11 between", value1, value2, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andZyxhRlYclxhqk11NotBetween(String value1, String value2) {
            addCriterion("zyxh_rl_yclXhqk_11 not between", value1, value2, "zyxhRlYclxhqk11");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhIsNull() {
            addCriterion("nyxh_slfmdh is null");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhIsNotNull() {
            addCriterion("nyxh_slfmdh is not null");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhEqualTo(String value) {
            addCriterion("nyxh_slfmdh =", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhNotEqualTo(String value) {
            addCriterion("nyxh_slfmdh <>", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhGreaterThan(String value) {
            addCriterion("nyxh_slfmdh >", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhGreaterThanOrEqualTo(String value) {
            addCriterion("nyxh_slfmdh >=", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhLessThan(String value) {
            addCriterion("nyxh_slfmdh <", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhLessThanOrEqualTo(String value) {
            addCriterion("nyxh_slfmdh <=", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhLike(String value) {
            addCriterion("nyxh_slfmdh like", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhNotLike(String value) {
            addCriterion("nyxh_slfmdh not like", value, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhIn(List<String> values) {
            addCriterion("nyxh_slfmdh in", values, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhNotIn(List<String> values) {
            addCriterion("nyxh_slfmdh not in", values, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhBetween(String value1, String value2) {
            addCriterion("nyxh_slfmdh between", value1, value2, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhSlfmdhNotBetween(String value1, String value2) {
            addCriterion("nyxh_slfmdh not between", value1, value2, "nyxhSlfmdh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhIsNull() {
            addCriterion("nyxh_kbsldh is null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhIsNotNull() {
            addCriterion("nyxh_kbsldh is not null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhEqualTo(String value) {
            addCriterion("nyxh_kbsldh =", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhNotEqualTo(String value) {
            addCriterion("nyxh_kbsldh <>", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhGreaterThan(String value) {
            addCriterion("nyxh_kbsldh >", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhGreaterThanOrEqualTo(String value) {
            addCriterion("nyxh_kbsldh >=", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhLessThan(String value) {
            addCriterion("nyxh_kbsldh <", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhLessThanOrEqualTo(String value) {
            addCriterion("nyxh_kbsldh <=", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhLike(String value) {
            addCriterion("nyxh_kbsldh like", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhNotLike(String value) {
            addCriterion("nyxh_kbsldh not like", value, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhIn(List<String> values) {
            addCriterion("nyxh_kbsldh in", values, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhNotIn(List<String> values) {
            addCriterion("nyxh_kbsldh not in", values, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhBetween(String value1, String value2) {
            addCriterion("nyxh_kbsldh between", value1, value2, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbsldhNotBetween(String value1, String value2) {
            addCriterion("nyxh_kbsldh not between", value1, value2, "nyxhKbsldh");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlIsNull() {
            addCriterion("nyxh_dwslfdl is null");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlIsNotNull() {
            addCriterion("nyxh_dwslfdl is not null");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlEqualTo(String value) {
            addCriterion("nyxh_dwslfdl =", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlNotEqualTo(String value) {
            addCriterion("nyxh_dwslfdl <>", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlGreaterThan(String value) {
            addCriterion("nyxh_dwslfdl >", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlGreaterThanOrEqualTo(String value) {
            addCriterion("nyxh_dwslfdl >=", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlLessThan(String value) {
            addCriterion("nyxh_dwslfdl <", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlLessThanOrEqualTo(String value) {
            addCriterion("nyxh_dwslfdl <=", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlLike(String value) {
            addCriterion("nyxh_dwslfdl like", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlNotLike(String value) {
            addCriterion("nyxh_dwslfdl not like", value, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlIn(List<String> values) {
            addCriterion("nyxh_dwslfdl in", values, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlNotIn(List<String> values) {
            addCriterion("nyxh_dwslfdl not in", values, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlBetween(String value1, String value2) {
            addCriterion("nyxh_dwslfdl between", value1, value2, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhDwslfdlNotBetween(String value1, String value2) {
            addCriterion("nyxh_dwslfdl not between", value1, value2, "nyxhDwslfdl");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhIsNull() {
            addCriterion("nyxh_kbslmh is null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhIsNotNull() {
            addCriterion("nyxh_kbslmh is not null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhEqualTo(String value) {
            addCriterion("nyxh_kbslmh =", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhNotEqualTo(String value) {
            addCriterion("nyxh_kbslmh <>", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhGreaterThan(String value) {
            addCriterion("nyxh_kbslmh >", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhGreaterThanOrEqualTo(String value) {
            addCriterion("nyxh_kbslmh >=", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhLessThan(String value) {
            addCriterion("nyxh_kbslmh <", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhLessThanOrEqualTo(String value) {
            addCriterion("nyxh_kbslmh <=", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhLike(String value) {
            addCriterion("nyxh_kbslmh like", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhNotLike(String value) {
            addCriterion("nyxh_kbslmh not like", value, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhIn(List<String> values) {
            addCriterion("nyxh_kbslmh in", values, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhNotIn(List<String> values) {
            addCriterion("nyxh_kbslmh not in", values, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhBetween(String value1, String value2) {
            addCriterion("nyxh_kbslmh between", value1, value2, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslmhNotBetween(String value1, String value2) {
            addCriterion("nyxh_kbslmh not between", value1, value2, "nyxhKbslmh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhIsNull() {
            addCriterion("nyxh_kbslnh is null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhIsNotNull() {
            addCriterion("nyxh_kbslnh is not null");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhEqualTo(String value) {
            addCriterion("nyxh_kbslnh =", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhNotEqualTo(String value) {
            addCriterion("nyxh_kbslnh <>", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhGreaterThan(String value) {
            addCriterion("nyxh_kbslnh >", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhGreaterThanOrEqualTo(String value) {
            addCriterion("nyxh_kbslnh >=", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhLessThan(String value) {
            addCriterion("nyxh_kbslnh <", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhLessThanOrEqualTo(String value) {
            addCriterion("nyxh_kbslnh <=", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhLike(String value) {
            addCriterion("nyxh_kbslnh like", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhNotLike(String value) {
            addCriterion("nyxh_kbslnh not like", value, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhIn(List<String> values) {
            addCriterion("nyxh_kbslnh in", values, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhNotIn(List<String> values) {
            addCriterion("nyxh_kbslnh not in", values, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhBetween(String value1, String value2) {
            addCriterion("nyxh_kbslnh between", value1, value2, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andNyxhKbslnhNotBetween(String value1, String value2) {
            addCriterion("nyxh_kbslnh not between", value1, value2, "nyxhKbslnh");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtIsNull() {
            addCriterion("fqpf_klw_npfl_yt is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtIsNotNull() {
            addCriterion("fqpf_klw_npfl_yt is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yt =", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtNotEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yt <>", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtGreaterThan(String value) {
            addCriterion("fqpf_klw_npfl_yt >", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yt >=", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtLessThan(String value) {
            addCriterion("fqpf_klw_npfl_yt <", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yt <=", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtLike(String value) {
            addCriterion("fqpf_klw_npfl_yt like", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtNotLike(String value) {
            addCriterion("fqpf_klw_npfl_yt not like", value, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_yt in", values, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtNotIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_yt not in", values, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_yt between", value1, value2, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYtNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_yt not between", value1, value2, "fqpfKlwNpflYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwIsNull() {
            addCriterion("fqpf_klw_npfl_yw is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwIsNotNull() {
            addCriterion("fqpf_klw_npfl_yw is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yw =", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwNotEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yw <>", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwGreaterThan(String value) {
            addCriterion("fqpf_klw_npfl_yw >", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yw >=", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwLessThan(String value) {
            addCriterion("fqpf_klw_npfl_yw <", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_yw <=", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwLike(String value) {
            addCriterion("fqpf_klw_npfl_yw like", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwNotLike(String value) {
            addCriterion("fqpf_klw_npfl_yw not like", value, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_yw in", values, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwNotIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_yw not in", values, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_yw between", value1, value2, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflYwNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_yw not between", value1, value2, "fqpfKlwNpflYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtIsNull() {
            addCriterion("fqpf_klw_pfnd_yt is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtIsNotNull() {
            addCriterion("fqpf_klw_pfnd_yt is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yt =", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtNotEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yt <>", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtGreaterThan(String value) {
            addCriterion("fqpf_klw_pfnd_yt >", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yt >=", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtLessThan(String value) {
            addCriterion("fqpf_klw_pfnd_yt <", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yt <=", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtLike(String value) {
            addCriterion("fqpf_klw_pfnd_yt like", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtNotLike(String value) {
            addCriterion("fqpf_klw_pfnd_yt not like", value, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_yt in", values, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtNotIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_yt not in", values, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_yt between", value1, value2, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYtNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_yt not between", value1, value2, "fqpfKlwPfndYt");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwIsNull() {
            addCriterion("fqpf_klw_pfnd_yw is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwIsNotNull() {
            addCriterion("fqpf_klw_pfnd_yw is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yw =", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwNotEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yw <>", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwGreaterThan(String value) {
            addCriterion("fqpf_klw_pfnd_yw >", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yw >=", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwLessThan(String value) {
            addCriterion("fqpf_klw_pfnd_yw <", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_yw <=", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwLike(String value) {
            addCriterion("fqpf_klw_pfnd_yw like", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwNotLike(String value) {
            addCriterion("fqpf_klw_pfnd_yw not like", value, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_yw in", values, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwNotIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_yw not in", values, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_yw between", value1, value2, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndYwNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_yw not between", value1, value2, "fqpfKlwPfndYw");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmIsNull() {
            addCriterion("fqpf_klw_npfl_mm is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmIsNotNull() {
            addCriterion("fqpf_klw_npfl_mm is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_mm =", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmNotEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_mm <>", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmGreaterThan(String value) {
            addCriterion("fqpf_klw_npfl_mm >", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_mm >=", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmLessThan(String value) {
            addCriterion("fqpf_klw_npfl_mm <", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_npfl_mm <=", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmLike(String value) {
            addCriterion("fqpf_klw_npfl_mm like", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmNotLike(String value) {
            addCriterion("fqpf_klw_npfl_mm not like", value, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_mm in", values, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmNotIn(List<String> values) {
            addCriterion("fqpf_klw_npfl_mm not in", values, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_mm between", value1, value2, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwNpflMmNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_npfl_mm not between", value1, value2, "fqpfKlwNpflMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmIsNull() {
            addCriterion("fqpf_klw_pfnd_mm is null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmIsNotNull() {
            addCriterion("fqpf_klw_pfnd_mm is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_mm =", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmNotEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_mm <>", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmGreaterThan(String value) {
            addCriterion("fqpf_klw_pfnd_mm >", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_mm >=", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmLessThan(String value) {
            addCriterion("fqpf_klw_pfnd_mm <", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmLessThanOrEqualTo(String value) {
            addCriterion("fqpf_klw_pfnd_mm <=", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmLike(String value) {
            addCriterion("fqpf_klw_pfnd_mm like", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmNotLike(String value) {
            addCriterion("fqpf_klw_pfnd_mm not like", value, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_mm in", values, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmNotIn(List<String> values) {
            addCriterion("fqpf_klw_pfnd_mm not in", values, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_mm between", value1, value2, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfKlwPfndMmNotBetween(String value1, String value2) {
            addCriterion("fqpf_klw_pfnd_mm not between", value1, value2, "fqpfKlwPfndMm");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2IsNull() {
            addCriterion("fqpf_fq_npfl_so2 is null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2IsNotNull() {
            addCriterion("fqpf_fq_npfl_so2 is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2EqualTo(String value) {
            addCriterion("fqpf_fq_npfl_so2 =", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2NotEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_so2 <>", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2GreaterThan(String value) {
            addCriterion("fqpf_fq_npfl_so2 >", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2GreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_so2 >=", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2LessThan(String value) {
            addCriterion("fqpf_fq_npfl_so2 <", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2LessThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_so2 <=", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2Like(String value) {
            addCriterion("fqpf_fq_npfl_so2 like", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2NotLike(String value) {
            addCriterion("fqpf_fq_npfl_so2 not like", value, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2In(List<String> values) {
            addCriterion("fqpf_fq_npfl_so2 in", values, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2NotIn(List<String> values) {
            addCriterion("fqpf_fq_npfl_so2 not in", values, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2Between(String value1, String value2) {
            addCriterion("fqpf_fq_npfl_so2 between", value1, value2, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflSo2NotBetween(String value1, String value2) {
            addCriterion("fqpf_fq_npfl_so2 not between", value1, value2, "fqpfFqNpflSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxIsNull() {
            addCriterion("fqpf_fq_npfl_nox is null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxIsNotNull() {
            addCriterion("fqpf_fq_npfl_nox is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_nox =", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxNotEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_nox <>", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxGreaterThan(String value) {
            addCriterion("fqpf_fq_npfl_nox >", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_nox >=", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxLessThan(String value) {
            addCriterion("fqpf_fq_npfl_nox <", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxLessThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_npfl_nox <=", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxLike(String value) {
            addCriterion("fqpf_fq_npfl_nox like", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxNotLike(String value) {
            addCriterion("fqpf_fq_npfl_nox not like", value, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxIn(List<String> values) {
            addCriterion("fqpf_fq_npfl_nox in", values, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxNotIn(List<String> values) {
            addCriterion("fqpf_fq_npfl_nox not in", values, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxBetween(String value1, String value2) {
            addCriterion("fqpf_fq_npfl_nox between", value1, value2, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqNpflNoxNotBetween(String value1, String value2) {
            addCriterion("fqpf_fq_npfl_nox not between", value1, value2, "fqpfFqNpflNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2IsNull() {
            addCriterion("fqpf_fq_pfnd_so2 is null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2IsNotNull() {
            addCriterion("fqpf_fq_pfnd_so2 is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2EqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_so2 =", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2NotEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_so2 <>", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2GreaterThan(String value) {
            addCriterion("fqpf_fq_pfnd_so2 >", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2GreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_so2 >=", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2LessThan(String value) {
            addCriterion("fqpf_fq_pfnd_so2 <", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2LessThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_so2 <=", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2Like(String value) {
            addCriterion("fqpf_fq_pfnd_so2 like", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2NotLike(String value) {
            addCriterion("fqpf_fq_pfnd_so2 not like", value, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2In(List<String> values) {
            addCriterion("fqpf_fq_pfnd_so2 in", values, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2NotIn(List<String> values) {
            addCriterion("fqpf_fq_pfnd_so2 not in", values, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2Between(String value1, String value2) {
            addCriterion("fqpf_fq_pfnd_so2 between", value1, value2, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndSo2NotBetween(String value1, String value2) {
            addCriterion("fqpf_fq_pfnd_so2 not between", value1, value2, "fqpfFqPfndSo2");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxIsNull() {
            addCriterion("fqpf_fq_pfnd_nox is null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxIsNotNull() {
            addCriterion("fqpf_fq_pfnd_nox is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_nox =", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxNotEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_nox <>", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxGreaterThan(String value) {
            addCriterion("fqpf_fq_pfnd_nox >", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_nox >=", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxLessThan(String value) {
            addCriterion("fqpf_fq_pfnd_nox <", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxLessThanOrEqualTo(String value) {
            addCriterion("fqpf_fq_pfnd_nox <=", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxLike(String value) {
            addCriterion("fqpf_fq_pfnd_nox like", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxNotLike(String value) {
            addCriterion("fqpf_fq_pfnd_nox not like", value, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxIn(List<String> values) {
            addCriterion("fqpf_fq_pfnd_nox in", values, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxNotIn(List<String> values) {
            addCriterion("fqpf_fq_pfnd_nox not in", values, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxBetween(String value1, String value2) {
            addCriterion("fqpf_fq_pfnd_nox between", value1, value2, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfFqPfndNoxNotBetween(String value1, String value2) {
            addCriterion("fqpf_fq_pfnd_nox not between", value1, value2, "fqpfFqPfndNox");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlIsNull() {
            addCriterion("fqpf_pd_sl is null");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlIsNotNull() {
            addCriterion("fqpf_pd_sl is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlEqualTo(String value) {
            addCriterion("fqpf_pd_sl =", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlNotEqualTo(String value) {
            addCriterion("fqpf_pd_sl <>", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlGreaterThan(String value) {
            addCriterion("fqpf_pd_sl >", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_pd_sl >=", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlLessThan(String value) {
            addCriterion("fqpf_pd_sl <", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlLessThanOrEqualTo(String value) {
            addCriterion("fqpf_pd_sl <=", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlLike(String value) {
            addCriterion("fqpf_pd_sl like", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlNotLike(String value) {
            addCriterion("fqpf_pd_sl not like", value, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlIn(List<String> values) {
            addCriterion("fqpf_pd_sl in", values, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlNotIn(List<String> values) {
            addCriterion("fqpf_pd_sl not in", values, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlBetween(String value1, String value2) {
            addCriterion("fqpf_pd_sl between", value1, value2, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdSlNotBetween(String value1, String value2) {
            addCriterion("fqpf_pd_sl not between", value1, value2, "fqpfPdSl");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsIsNull() {
            addCriterion("fqpf_pd_ccfs is null");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsIsNotNull() {
            addCriterion("fqpf_pd_ccfs is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsEqualTo(String value) {
            addCriterion("fqpf_pd_ccfs =", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsNotEqualTo(String value) {
            addCriterion("fqpf_pd_ccfs <>", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsGreaterThan(String value) {
            addCriterion("fqpf_pd_ccfs >", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_pd_ccfs >=", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsLessThan(String value) {
            addCriterion("fqpf_pd_ccfs <", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsLessThanOrEqualTo(String value) {
            addCriterion("fqpf_pd_ccfs <=", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsLike(String value) {
            addCriterion("fqpf_pd_ccfs like", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsNotLike(String value) {
            addCriterion("fqpf_pd_ccfs not like", value, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsIn(List<String> values) {
            addCriterion("fqpf_pd_ccfs in", values, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsNotIn(List<String> values) {
            addCriterion("fqpf_pd_ccfs not in", values, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsBetween(String value1, String value2) {
            addCriterion("fqpf_pd_ccfs between", value1, value2, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfPdCcfsNotBetween(String value1, String value2) {
            addCriterion("fqpf_pd_ccfs not between", value1, value2, "fqpfPdCcfs");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyIsNull() {
            addCriterion("fqpf_txgy is null");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyIsNotNull() {
            addCriterion("fqpf_txgy is not null");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyEqualTo(String value) {
            addCriterion("fqpf_txgy =", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyNotEqualTo(String value) {
            addCriterion("fqpf_txgy <>", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyGreaterThan(String value) {
            addCriterion("fqpf_txgy >", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyGreaterThanOrEqualTo(String value) {
            addCriterion("fqpf_txgy >=", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyLessThan(String value) {
            addCriterion("fqpf_txgy <", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyLessThanOrEqualTo(String value) {
            addCriterion("fqpf_txgy <=", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyLike(String value) {
            addCriterion("fqpf_txgy like", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyNotLike(String value) {
            addCriterion("fqpf_txgy not like", value, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyIn(List<String> values) {
            addCriterion("fqpf_txgy in", values, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyNotIn(List<String> values) {
            addCriterion("fqpf_txgy not in", values, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyBetween(String value1, String value2) {
            addCriterion("fqpf_txgy between", value1, value2, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andFqpfTxgyNotBetween(String value1, String value2) {
            addCriterion("fqpf_txgy not between", value1, value2, "fqpfTxgy");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0IsNull() {
            addCriterion("zysb_slm_ggxh0 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0IsNotNull() {
            addCriterion("zysb_slm_ggxh0 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0EqualTo(String value) {
            addCriterion("zysb_slm_ggxh0 =", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh0 <>", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh0 >", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh0 >=", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0LessThan(String value) {
            addCriterion("zysb_slm_ggxh0 <", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh0 <=", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0Like(String value) {
            addCriterion("zysb_slm_ggxh0 like", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0NotLike(String value) {
            addCriterion("zysb_slm_ggxh0 not like", value, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0In(List<String> values) {
            addCriterion("zysb_slm_ggxh0 in", values, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh0 not in", values, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh0 between", value1, value2, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh0NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh0 not between", value1, value2, "zysbSlmGgxh0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1IsNull() {
            addCriterion("zysb_slm_ggxh1 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1IsNotNull() {
            addCriterion("zysb_slm_ggxh1 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1EqualTo(String value) {
            addCriterion("zysb_slm_ggxh1 =", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh1 <>", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh1 >", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh1 >=", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1LessThan(String value) {
            addCriterion("zysb_slm_ggxh1 <", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh1 <=", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1Like(String value) {
            addCriterion("zysb_slm_ggxh1 like", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1NotLike(String value) {
            addCriterion("zysb_slm_ggxh1 not like", value, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1In(List<String> values) {
            addCriterion("zysb_slm_ggxh1 in", values, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh1 not in", values, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh1 between", value1, value2, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh1NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh1 not between", value1, value2, "zysbSlmGgxh1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2IsNull() {
            addCriterion("zysb_slm_ggxh2 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2IsNotNull() {
            addCriterion("zysb_slm_ggxh2 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2EqualTo(String value) {
            addCriterion("zysb_slm_ggxh2 =", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh2 <>", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh2 >", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh2 >=", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2LessThan(String value) {
            addCriterion("zysb_slm_ggxh2 <", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh2 <=", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2Like(String value) {
            addCriterion("zysb_slm_ggxh2 like", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2NotLike(String value) {
            addCriterion("zysb_slm_ggxh2 not like", value, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2In(List<String> values) {
            addCriterion("zysb_slm_ggxh2 in", values, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh2 not in", values, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh2 between", value1, value2, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh2NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh2 not between", value1, value2, "zysbSlmGgxh2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3IsNull() {
            addCriterion("zysb_slm_ggxh3 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3IsNotNull() {
            addCriterion("zysb_slm_ggxh3 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3EqualTo(String value) {
            addCriterion("zysb_slm_ggxh3 =", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh3 <>", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh3 >", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh3 >=", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3LessThan(String value) {
            addCriterion("zysb_slm_ggxh3 <", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh3 <=", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3Like(String value) {
            addCriterion("zysb_slm_ggxh3 like", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3NotLike(String value) {
            addCriterion("zysb_slm_ggxh3 not like", value, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3In(List<String> values) {
            addCriterion("zysb_slm_ggxh3 in", values, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh3 not in", values, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh3 between", value1, value2, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh3NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh3 not between", value1, value2, "zysbSlmGgxh3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4IsNull() {
            addCriterion("zysb_slm_ggxh4 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4IsNotNull() {
            addCriterion("zysb_slm_ggxh4 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4EqualTo(String value) {
            addCriterion("zysb_slm_ggxh4 =", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh4 <>", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh4 >", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh4 >=", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4LessThan(String value) {
            addCriterion("zysb_slm_ggxh4 <", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh4 <=", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4Like(String value) {
            addCriterion("zysb_slm_ggxh4 like", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4NotLike(String value) {
            addCriterion("zysb_slm_ggxh4 not like", value, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4In(List<String> values) {
            addCriterion("zysb_slm_ggxh4 in", values, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh4 not in", values, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh4 between", value1, value2, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh4NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh4 not between", value1, value2, "zysbSlmGgxh4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5IsNull() {
            addCriterion("zysb_slm_ggxh5 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5IsNotNull() {
            addCriterion("zysb_slm_ggxh5 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5EqualTo(String value) {
            addCriterion("zysb_slm_ggxh5 =", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh5 <>", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh5 >", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh5 >=", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5LessThan(String value) {
            addCriterion("zysb_slm_ggxh5 <", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh5 <=", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5Like(String value) {
            addCriterion("zysb_slm_ggxh5 like", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5NotLike(String value) {
            addCriterion("zysb_slm_ggxh5 not like", value, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5In(List<String> values) {
            addCriterion("zysb_slm_ggxh5 in", values, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh5 not in", values, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh5 between", value1, value2, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh5NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh5 not between", value1, value2, "zysbSlmGgxh5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6IsNull() {
            addCriterion("zysb_slm_ggxh6 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6IsNotNull() {
            addCriterion("zysb_slm_ggxh6 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6EqualTo(String value) {
            addCriterion("zysb_slm_ggxh6 =", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh6 <>", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh6 >", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh6 >=", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6LessThan(String value) {
            addCriterion("zysb_slm_ggxh6 <", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh6 <=", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6Like(String value) {
            addCriterion("zysb_slm_ggxh6 like", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6NotLike(String value) {
            addCriterion("zysb_slm_ggxh6 not like", value, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6In(List<String> values) {
            addCriterion("zysb_slm_ggxh6 in", values, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh6 not in", values, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh6 between", value1, value2, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh6NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh6 not between", value1, value2, "zysbSlmGgxh6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7IsNull() {
            addCriterion("zysb_slm_ggxh7 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7IsNotNull() {
            addCriterion("zysb_slm_ggxh7 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7EqualTo(String value) {
            addCriterion("zysb_slm_ggxh7 =", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh7 <>", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh7 >", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh7 >=", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7LessThan(String value) {
            addCriterion("zysb_slm_ggxh7 <", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh7 <=", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7Like(String value) {
            addCriterion("zysb_slm_ggxh7 like", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7NotLike(String value) {
            addCriterion("zysb_slm_ggxh7 not like", value, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7In(List<String> values) {
            addCriterion("zysb_slm_ggxh7 in", values, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh7 not in", values, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh7 between", value1, value2, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh7NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh7 not between", value1, value2, "zysbSlmGgxh7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8IsNull() {
            addCriterion("zysb_slm_ggxh8 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8IsNotNull() {
            addCriterion("zysb_slm_ggxh8 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8EqualTo(String value) {
            addCriterion("zysb_slm_ggxh8 =", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh8 <>", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh8 >", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh8 >=", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8LessThan(String value) {
            addCriterion("zysb_slm_ggxh8 <", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh8 <=", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8Like(String value) {
            addCriterion("zysb_slm_ggxh8 like", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8NotLike(String value) {
            addCriterion("zysb_slm_ggxh8 not like", value, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8In(List<String> values) {
            addCriterion("zysb_slm_ggxh8 in", values, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh8 not in", values, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh8 between", value1, value2, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh8NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh8 not between", value1, value2, "zysbSlmGgxh8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9IsNull() {
            addCriterion("zysb_slm_ggxh9 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9IsNotNull() {
            addCriterion("zysb_slm_ggxh9 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9EqualTo(String value) {
            addCriterion("zysb_slm_ggxh9 =", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh9 <>", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh9 >", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh9 >=", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9LessThan(String value) {
            addCriterion("zysb_slm_ggxh9 <", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh9 <=", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9Like(String value) {
            addCriterion("zysb_slm_ggxh9 like", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9NotLike(String value) {
            addCriterion("zysb_slm_ggxh9 not like", value, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9In(List<String> values) {
            addCriterion("zysb_slm_ggxh9 in", values, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh9 not in", values, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh9 between", value1, value2, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh9NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh9 not between", value1, value2, "zysbSlmGgxh9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10IsNull() {
            addCriterion("zysb_slm_ggxh10 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10IsNotNull() {
            addCriterion("zysb_slm_ggxh10 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10EqualTo(String value) {
            addCriterion("zysb_slm_ggxh10 =", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh10 <>", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh10 >", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh10 >=", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10LessThan(String value) {
            addCriterion("zysb_slm_ggxh10 <", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh10 <=", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10Like(String value) {
            addCriterion("zysb_slm_ggxh10 like", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10NotLike(String value) {
            addCriterion("zysb_slm_ggxh10 not like", value, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10In(List<String> values) {
            addCriterion("zysb_slm_ggxh10 in", values, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh10 not in", values, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh10 between", value1, value2, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh10NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh10 not between", value1, value2, "zysbSlmGgxh10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11IsNull() {
            addCriterion("zysb_slm_ggxh11 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11IsNotNull() {
            addCriterion("zysb_slm_ggxh11 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11EqualTo(String value) {
            addCriterion("zysb_slm_ggxh11 =", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh11 <>", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh11 >", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh11 >=", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11LessThan(String value) {
            addCriterion("zysb_slm_ggxh11 <", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh11 <=", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11Like(String value) {
            addCriterion("zysb_slm_ggxh11 like", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11NotLike(String value) {
            addCriterion("zysb_slm_ggxh11 not like", value, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11In(List<String> values) {
            addCriterion("zysb_slm_ggxh11 in", values, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh11 not in", values, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh11 between", value1, value2, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh11NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh11 not between", value1, value2, "zysbSlmGgxh11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12IsNull() {
            addCriterion("zysb_slm_ggxh12 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12IsNotNull() {
            addCriterion("zysb_slm_ggxh12 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12EqualTo(String value) {
            addCriterion("zysb_slm_ggxh12 =", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh12 <>", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh12 >", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh12 >=", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12LessThan(String value) {
            addCriterion("zysb_slm_ggxh12 <", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh12 <=", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12Like(String value) {
            addCriterion("zysb_slm_ggxh12 like", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12NotLike(String value) {
            addCriterion("zysb_slm_ggxh12 not like", value, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12In(List<String> values) {
            addCriterion("zysb_slm_ggxh12 in", values, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh12 not in", values, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh12 between", value1, value2, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh12NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh12 not between", value1, value2, "zysbSlmGgxh12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13IsNull() {
            addCriterion("zysb_slm_ggxh13 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13IsNotNull() {
            addCriterion("zysb_slm_ggxh13 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13EqualTo(String value) {
            addCriterion("zysb_slm_ggxh13 =", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh13 <>", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh13 >", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh13 >=", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13LessThan(String value) {
            addCriterion("zysb_slm_ggxh13 <", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh13 <=", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13Like(String value) {
            addCriterion("zysb_slm_ggxh13 like", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13NotLike(String value) {
            addCriterion("zysb_slm_ggxh13 not like", value, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13In(List<String> values) {
            addCriterion("zysb_slm_ggxh13 in", values, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh13 not in", values, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh13 between", value1, value2, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh13NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh13 not between", value1, value2, "zysbSlmGgxh13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14IsNull() {
            addCriterion("zysb_slm_ggxh14 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14IsNotNull() {
            addCriterion("zysb_slm_ggxh14 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14EqualTo(String value) {
            addCriterion("zysb_slm_ggxh14 =", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh14 <>", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh14 >", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh14 >=", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14LessThan(String value) {
            addCriterion("zysb_slm_ggxh14 <", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh14 <=", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14Like(String value) {
            addCriterion("zysb_slm_ggxh14 like", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14NotLike(String value) {
            addCriterion("zysb_slm_ggxh14 not like", value, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14In(List<String> values) {
            addCriterion("zysb_slm_ggxh14 in", values, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh14 not in", values, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh14 between", value1, value2, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh14NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh14 not between", value1, value2, "zysbSlmGgxh14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15IsNull() {
            addCriterion("zysb_slm_ggxh15 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15IsNotNull() {
            addCriterion("zysb_slm_ggxh15 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15EqualTo(String value) {
            addCriterion("zysb_slm_ggxh15 =", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh15 <>", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh15 >", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh15 >=", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15LessThan(String value) {
            addCriterion("zysb_slm_ggxh15 <", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh15 <=", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15Like(String value) {
            addCriterion("zysb_slm_ggxh15 like", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15NotLike(String value) {
            addCriterion("zysb_slm_ggxh15 not like", value, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15In(List<String> values) {
            addCriterion("zysb_slm_ggxh15 in", values, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh15 not in", values, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh15 between", value1, value2, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh15NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh15 not between", value1, value2, "zysbSlmGgxh15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16IsNull() {
            addCriterion("zysb_slm_ggxh16 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16IsNotNull() {
            addCriterion("zysb_slm_ggxh16 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16EqualTo(String value) {
            addCriterion("zysb_slm_ggxh16 =", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh16 <>", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh16 >", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh16 >=", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16LessThan(String value) {
            addCriterion("zysb_slm_ggxh16 <", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh16 <=", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16Like(String value) {
            addCriterion("zysb_slm_ggxh16 like", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16NotLike(String value) {
            addCriterion("zysb_slm_ggxh16 not like", value, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16In(List<String> values) {
            addCriterion("zysb_slm_ggxh16 in", values, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh16 not in", values, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh16 between", value1, value2, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh16NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh16 not between", value1, value2, "zysbSlmGgxh16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17IsNull() {
            addCriterion("zysb_slm_ggxh17 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17IsNotNull() {
            addCriterion("zysb_slm_ggxh17 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17EqualTo(String value) {
            addCriterion("zysb_slm_ggxh17 =", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh17 <>", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh17 >", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh17 >=", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17LessThan(String value) {
            addCriterion("zysb_slm_ggxh17 <", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh17 <=", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17Like(String value) {
            addCriterion("zysb_slm_ggxh17 like", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17NotLike(String value) {
            addCriterion("zysb_slm_ggxh17 not like", value, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17In(List<String> values) {
            addCriterion("zysb_slm_ggxh17 in", values, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh17 not in", values, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh17 between", value1, value2, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh17NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh17 not between", value1, value2, "zysbSlmGgxh17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18IsNull() {
            addCriterion("zysb_slm_ggxh18 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18IsNotNull() {
            addCriterion("zysb_slm_ggxh18 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18EqualTo(String value) {
            addCriterion("zysb_slm_ggxh18 =", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh18 <>", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh18 >", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh18 >=", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18LessThan(String value) {
            addCriterion("zysb_slm_ggxh18 <", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh18 <=", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18Like(String value) {
            addCriterion("zysb_slm_ggxh18 like", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18NotLike(String value) {
            addCriterion("zysb_slm_ggxh18 not like", value, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18In(List<String> values) {
            addCriterion("zysb_slm_ggxh18 in", values, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh18 not in", values, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh18 between", value1, value2, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh18NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh18 not between", value1, value2, "zysbSlmGgxh18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19IsNull() {
            addCriterion("zysb_slm_ggxh19 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19IsNotNull() {
            addCriterion("zysb_slm_ggxh19 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19EqualTo(String value) {
            addCriterion("zysb_slm_ggxh19 =", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh19 <>", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh19 >", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh19 >=", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19LessThan(String value) {
            addCriterion("zysb_slm_ggxh19 <", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh19 <=", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19Like(String value) {
            addCriterion("zysb_slm_ggxh19 like", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19NotLike(String value) {
            addCriterion("zysb_slm_ggxh19 not like", value, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19In(List<String> values) {
            addCriterion("zysb_slm_ggxh19 in", values, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh19 not in", values, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh19 between", value1, value2, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh19NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh19 not between", value1, value2, "zysbSlmGgxh19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20IsNull() {
            addCriterion("zysb_slm_ggxh20 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20IsNotNull() {
            addCriterion("zysb_slm_ggxh20 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20EqualTo(String value) {
            addCriterion("zysb_slm_ggxh20 =", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh20 <>", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh20 >", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh20 >=", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20LessThan(String value) {
            addCriterion("zysb_slm_ggxh20 <", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh20 <=", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20Like(String value) {
            addCriterion("zysb_slm_ggxh20 like", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20NotLike(String value) {
            addCriterion("zysb_slm_ggxh20 not like", value, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20In(List<String> values) {
            addCriterion("zysb_slm_ggxh20 in", values, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh20 not in", values, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh20 between", value1, value2, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh20NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh20 not between", value1, value2, "zysbSlmGgxh20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21IsNull() {
            addCriterion("zysb_slm_ggxh21 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21IsNotNull() {
            addCriterion("zysb_slm_ggxh21 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21EqualTo(String value) {
            addCriterion("zysb_slm_ggxh21 =", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh21 <>", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh21 >", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh21 >=", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21LessThan(String value) {
            addCriterion("zysb_slm_ggxh21 <", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh21 <=", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21Like(String value) {
            addCriterion("zysb_slm_ggxh21 like", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21NotLike(String value) {
            addCriterion("zysb_slm_ggxh21 not like", value, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21In(List<String> values) {
            addCriterion("zysb_slm_ggxh21 in", values, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh21 not in", values, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh21 between", value1, value2, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh21NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh21 not between", value1, value2, "zysbSlmGgxh21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22IsNull() {
            addCriterion("zysb_slm_ggxh22 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22IsNotNull() {
            addCriterion("zysb_slm_ggxh22 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22EqualTo(String value) {
            addCriterion("zysb_slm_ggxh22 =", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh22 <>", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh22 >", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh22 >=", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22LessThan(String value) {
            addCriterion("zysb_slm_ggxh22 <", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh22 <=", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22Like(String value) {
            addCriterion("zysb_slm_ggxh22 like", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22NotLike(String value) {
            addCriterion("zysb_slm_ggxh22 not like", value, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22In(List<String> values) {
            addCriterion("zysb_slm_ggxh22 in", values, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh22 not in", values, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh22 between", value1, value2, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh22NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh22 not between", value1, value2, "zysbSlmGgxh22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23IsNull() {
            addCriterion("zysb_slm_ggxh23 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23IsNotNull() {
            addCriterion("zysb_slm_ggxh23 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23EqualTo(String value) {
            addCriterion("zysb_slm_ggxh23 =", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh23 <>", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh23 >", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh23 >=", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23LessThan(String value) {
            addCriterion("zysb_slm_ggxh23 <", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh23 <=", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23Like(String value) {
            addCriterion("zysb_slm_ggxh23 like", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23NotLike(String value) {
            addCriterion("zysb_slm_ggxh23 not like", value, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23In(List<String> values) {
            addCriterion("zysb_slm_ggxh23 in", values, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh23 not in", values, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh23 between", value1, value2, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh23NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh23 not between", value1, value2, "zysbSlmGgxh23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24IsNull() {
            addCriterion("zysb_slm_ggxh24 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24IsNotNull() {
            addCriterion("zysb_slm_ggxh24 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24EqualTo(String value) {
            addCriterion("zysb_slm_ggxh24 =", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh24 <>", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh24 >", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh24 >=", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24LessThan(String value) {
            addCriterion("zysb_slm_ggxh24 <", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh24 <=", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24Like(String value) {
            addCriterion("zysb_slm_ggxh24 like", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24NotLike(String value) {
            addCriterion("zysb_slm_ggxh24 not like", value, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24In(List<String> values) {
            addCriterion("zysb_slm_ggxh24 in", values, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh24 not in", values, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh24 between", value1, value2, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh24NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh24 not between", value1, value2, "zysbSlmGgxh24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25IsNull() {
            addCriterion("zysb_slm_ggxh25 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25IsNotNull() {
            addCriterion("zysb_slm_ggxh25 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25EqualTo(String value) {
            addCriterion("zysb_slm_ggxh25 =", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh25 <>", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh25 >", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh25 >=", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25LessThan(String value) {
            addCriterion("zysb_slm_ggxh25 <", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh25 <=", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25Like(String value) {
            addCriterion("zysb_slm_ggxh25 like", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25NotLike(String value) {
            addCriterion("zysb_slm_ggxh25 not like", value, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25In(List<String> values) {
            addCriterion("zysb_slm_ggxh25 in", values, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh25 not in", values, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh25 between", value1, value2, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh25NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh25 not between", value1, value2, "zysbSlmGgxh25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26IsNull() {
            addCriterion("zysb_slm_ggxh26 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26IsNotNull() {
            addCriterion("zysb_slm_ggxh26 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26EqualTo(String value) {
            addCriterion("zysb_slm_ggxh26 =", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh26 <>", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh26 >", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh26 >=", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26LessThan(String value) {
            addCriterion("zysb_slm_ggxh26 <", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh26 <=", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26Like(String value) {
            addCriterion("zysb_slm_ggxh26 like", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26NotLike(String value) {
            addCriterion("zysb_slm_ggxh26 not like", value, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26In(List<String> values) {
            addCriterion("zysb_slm_ggxh26 in", values, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh26 not in", values, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh26 between", value1, value2, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh26NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh26 not between", value1, value2, "zysbSlmGgxh26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27IsNull() {
            addCriterion("zysb_slm_ggxh27 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27IsNotNull() {
            addCriterion("zysb_slm_ggxh27 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27EqualTo(String value) {
            addCriterion("zysb_slm_ggxh27 =", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh27 <>", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh27 >", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh27 >=", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27LessThan(String value) {
            addCriterion("zysb_slm_ggxh27 <", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh27 <=", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27Like(String value) {
            addCriterion("zysb_slm_ggxh27 like", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27NotLike(String value) {
            addCriterion("zysb_slm_ggxh27 not like", value, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27In(List<String> values) {
            addCriterion("zysb_slm_ggxh27 in", values, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh27 not in", values, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh27 between", value1, value2, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh27NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh27 not between", value1, value2, "zysbSlmGgxh27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28IsNull() {
            addCriterion("zysb_slm_ggxh28 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28IsNotNull() {
            addCriterion("zysb_slm_ggxh28 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28EqualTo(String value) {
            addCriterion("zysb_slm_ggxh28 =", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh28 <>", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh28 >", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh28 >=", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28LessThan(String value) {
            addCriterion("zysb_slm_ggxh28 <", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh28 <=", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28Like(String value) {
            addCriterion("zysb_slm_ggxh28 like", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28NotLike(String value) {
            addCriterion("zysb_slm_ggxh28 not like", value, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28In(List<String> values) {
            addCriterion("zysb_slm_ggxh28 in", values, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh28 not in", values, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh28 between", value1, value2, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh28NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh28 not between", value1, value2, "zysbSlmGgxh28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29IsNull() {
            addCriterion("zysb_slm_ggxh29 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29IsNotNull() {
            addCriterion("zysb_slm_ggxh29 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29EqualTo(String value) {
            addCriterion("zysb_slm_ggxh29 =", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29NotEqualTo(String value) {
            addCriterion("zysb_slm_ggxh29 <>", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29GreaterThan(String value) {
            addCriterion("zysb_slm_ggxh29 >", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh29 >=", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29LessThan(String value) {
            addCriterion("zysb_slm_ggxh29 <", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_ggxh29 <=", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29Like(String value) {
            addCriterion("zysb_slm_ggxh29 like", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29NotLike(String value) {
            addCriterion("zysb_slm_ggxh29 not like", value, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29In(List<String> values) {
            addCriterion("zysb_slm_ggxh29 in", values, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29NotIn(List<String> values) {
            addCriterion("zysb_slm_ggxh29 not in", values, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29Between(String value1, String value2) {
            addCriterion("zysb_slm_ggxh29 between", value1, value2, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmGgxh29NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_ggxh29 not between", value1, value2, "zysbSlmGgxh29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0IsNull() {
            addCriterion("zysb_slm_sl0 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0IsNotNull() {
            addCriterion("zysb_slm_sl0 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0EqualTo(String value) {
            addCriterion("zysb_slm_sl0 =", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0NotEqualTo(String value) {
            addCriterion("zysb_slm_sl0 <>", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0GreaterThan(String value) {
            addCriterion("zysb_slm_sl0 >", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl0 >=", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0LessThan(String value) {
            addCriterion("zysb_slm_sl0 <", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl0 <=", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0Like(String value) {
            addCriterion("zysb_slm_sl0 like", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0NotLike(String value) {
            addCriterion("zysb_slm_sl0 not like", value, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0In(List<String> values) {
            addCriterion("zysb_slm_sl0 in", values, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0NotIn(List<String> values) {
            addCriterion("zysb_slm_sl0 not in", values, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0Between(String value1, String value2) {
            addCriterion("zysb_slm_sl0 between", value1, value2, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl0NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl0 not between", value1, value2, "zysbSlmSl0");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1IsNull() {
            addCriterion("zysb_slm_sl1 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1IsNotNull() {
            addCriterion("zysb_slm_sl1 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1EqualTo(String value) {
            addCriterion("zysb_slm_sl1 =", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1NotEqualTo(String value) {
            addCriterion("zysb_slm_sl1 <>", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1GreaterThan(String value) {
            addCriterion("zysb_slm_sl1 >", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl1 >=", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1LessThan(String value) {
            addCriterion("zysb_slm_sl1 <", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl1 <=", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1Like(String value) {
            addCriterion("zysb_slm_sl1 like", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1NotLike(String value) {
            addCriterion("zysb_slm_sl1 not like", value, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1In(List<String> values) {
            addCriterion("zysb_slm_sl1 in", values, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1NotIn(List<String> values) {
            addCriterion("zysb_slm_sl1 not in", values, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1Between(String value1, String value2) {
            addCriterion("zysb_slm_sl1 between", value1, value2, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl1NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl1 not between", value1, value2, "zysbSlmSl1");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2IsNull() {
            addCriterion("zysb_slm_sl2 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2IsNotNull() {
            addCriterion("zysb_slm_sl2 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2EqualTo(String value) {
            addCriterion("zysb_slm_sl2 =", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2NotEqualTo(String value) {
            addCriterion("zysb_slm_sl2 <>", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2GreaterThan(String value) {
            addCriterion("zysb_slm_sl2 >", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl2 >=", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2LessThan(String value) {
            addCriterion("zysb_slm_sl2 <", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl2 <=", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2Like(String value) {
            addCriterion("zysb_slm_sl2 like", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2NotLike(String value) {
            addCriterion("zysb_slm_sl2 not like", value, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2In(List<String> values) {
            addCriterion("zysb_slm_sl2 in", values, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2NotIn(List<String> values) {
            addCriterion("zysb_slm_sl2 not in", values, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2Between(String value1, String value2) {
            addCriterion("zysb_slm_sl2 between", value1, value2, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl2NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl2 not between", value1, value2, "zysbSlmSl2");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3IsNull() {
            addCriterion("zysb_slm_sl3 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3IsNotNull() {
            addCriterion("zysb_slm_sl3 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3EqualTo(String value) {
            addCriterion("zysb_slm_sl3 =", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3NotEqualTo(String value) {
            addCriterion("zysb_slm_sl3 <>", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3GreaterThan(String value) {
            addCriterion("zysb_slm_sl3 >", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl3 >=", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3LessThan(String value) {
            addCriterion("zysb_slm_sl3 <", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl3 <=", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3Like(String value) {
            addCriterion("zysb_slm_sl3 like", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3NotLike(String value) {
            addCriterion("zysb_slm_sl3 not like", value, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3In(List<String> values) {
            addCriterion("zysb_slm_sl3 in", values, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3NotIn(List<String> values) {
            addCriterion("zysb_slm_sl3 not in", values, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3Between(String value1, String value2) {
            addCriterion("zysb_slm_sl3 between", value1, value2, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl3NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl3 not between", value1, value2, "zysbSlmSl3");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4IsNull() {
            addCriterion("zysb_slm_sl4 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4IsNotNull() {
            addCriterion("zysb_slm_sl4 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4EqualTo(String value) {
            addCriterion("zysb_slm_sl4 =", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4NotEqualTo(String value) {
            addCriterion("zysb_slm_sl4 <>", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4GreaterThan(String value) {
            addCriterion("zysb_slm_sl4 >", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl4 >=", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4LessThan(String value) {
            addCriterion("zysb_slm_sl4 <", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl4 <=", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4Like(String value) {
            addCriterion("zysb_slm_sl4 like", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4NotLike(String value) {
            addCriterion("zysb_slm_sl4 not like", value, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4In(List<String> values) {
            addCriterion("zysb_slm_sl4 in", values, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4NotIn(List<String> values) {
            addCriterion("zysb_slm_sl4 not in", values, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4Between(String value1, String value2) {
            addCriterion("zysb_slm_sl4 between", value1, value2, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl4NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl4 not between", value1, value2, "zysbSlmSl4");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5IsNull() {
            addCriterion("zysb_slm_sl5 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5IsNotNull() {
            addCriterion("zysb_slm_sl5 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5EqualTo(String value) {
            addCriterion("zysb_slm_sl5 =", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5NotEqualTo(String value) {
            addCriterion("zysb_slm_sl5 <>", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5GreaterThan(String value) {
            addCriterion("zysb_slm_sl5 >", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl5 >=", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5LessThan(String value) {
            addCriterion("zysb_slm_sl5 <", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl5 <=", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5Like(String value) {
            addCriterion("zysb_slm_sl5 like", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5NotLike(String value) {
            addCriterion("zysb_slm_sl5 not like", value, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5In(List<String> values) {
            addCriterion("zysb_slm_sl5 in", values, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5NotIn(List<String> values) {
            addCriterion("zysb_slm_sl5 not in", values, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5Between(String value1, String value2) {
            addCriterion("zysb_slm_sl5 between", value1, value2, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl5NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl5 not between", value1, value2, "zysbSlmSl5");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6IsNull() {
            addCriterion("zysb_slm_sl6 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6IsNotNull() {
            addCriterion("zysb_slm_sl6 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6EqualTo(String value) {
            addCriterion("zysb_slm_sl6 =", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6NotEqualTo(String value) {
            addCriterion("zysb_slm_sl6 <>", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6GreaterThan(String value) {
            addCriterion("zysb_slm_sl6 >", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl6 >=", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6LessThan(String value) {
            addCriterion("zysb_slm_sl6 <", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl6 <=", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6Like(String value) {
            addCriterion("zysb_slm_sl6 like", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6NotLike(String value) {
            addCriterion("zysb_slm_sl6 not like", value, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6In(List<String> values) {
            addCriterion("zysb_slm_sl6 in", values, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6NotIn(List<String> values) {
            addCriterion("zysb_slm_sl6 not in", values, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6Between(String value1, String value2) {
            addCriterion("zysb_slm_sl6 between", value1, value2, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl6NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl6 not between", value1, value2, "zysbSlmSl6");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7IsNull() {
            addCriterion("zysb_slm_sl7 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7IsNotNull() {
            addCriterion("zysb_slm_sl7 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7EqualTo(String value) {
            addCriterion("zysb_slm_sl7 =", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7NotEqualTo(String value) {
            addCriterion("zysb_slm_sl7 <>", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7GreaterThan(String value) {
            addCriterion("zysb_slm_sl7 >", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl7 >=", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7LessThan(String value) {
            addCriterion("zysb_slm_sl7 <", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl7 <=", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7Like(String value) {
            addCriterion("zysb_slm_sl7 like", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7NotLike(String value) {
            addCriterion("zysb_slm_sl7 not like", value, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7In(List<String> values) {
            addCriterion("zysb_slm_sl7 in", values, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7NotIn(List<String> values) {
            addCriterion("zysb_slm_sl7 not in", values, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7Between(String value1, String value2) {
            addCriterion("zysb_slm_sl7 between", value1, value2, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl7NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl7 not between", value1, value2, "zysbSlmSl7");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8IsNull() {
            addCriterion("zysb_slm_sl8 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8IsNotNull() {
            addCriterion("zysb_slm_sl8 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8EqualTo(String value) {
            addCriterion("zysb_slm_sl8 =", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8NotEqualTo(String value) {
            addCriterion("zysb_slm_sl8 <>", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8GreaterThan(String value) {
            addCriterion("zysb_slm_sl8 >", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl8 >=", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8LessThan(String value) {
            addCriterion("zysb_slm_sl8 <", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl8 <=", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8Like(String value) {
            addCriterion("zysb_slm_sl8 like", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8NotLike(String value) {
            addCriterion("zysb_slm_sl8 not like", value, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8In(List<String> values) {
            addCriterion("zysb_slm_sl8 in", values, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8NotIn(List<String> values) {
            addCriterion("zysb_slm_sl8 not in", values, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8Between(String value1, String value2) {
            addCriterion("zysb_slm_sl8 between", value1, value2, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl8NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl8 not between", value1, value2, "zysbSlmSl8");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9IsNull() {
            addCriterion("zysb_slm_sl9 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9IsNotNull() {
            addCriterion("zysb_slm_sl9 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9EqualTo(String value) {
            addCriterion("zysb_slm_sl9 =", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9NotEqualTo(String value) {
            addCriterion("zysb_slm_sl9 <>", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9GreaterThan(String value) {
            addCriterion("zysb_slm_sl9 >", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl9 >=", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9LessThan(String value) {
            addCriterion("zysb_slm_sl9 <", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl9 <=", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9Like(String value) {
            addCriterion("zysb_slm_sl9 like", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9NotLike(String value) {
            addCriterion("zysb_slm_sl9 not like", value, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9In(List<String> values) {
            addCriterion("zysb_slm_sl9 in", values, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9NotIn(List<String> values) {
            addCriterion("zysb_slm_sl9 not in", values, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9Between(String value1, String value2) {
            addCriterion("zysb_slm_sl9 between", value1, value2, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl9NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl9 not between", value1, value2, "zysbSlmSl9");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10IsNull() {
            addCriterion("zysb_slm_sl10 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10IsNotNull() {
            addCriterion("zysb_slm_sl10 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10EqualTo(String value) {
            addCriterion("zysb_slm_sl10 =", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10NotEqualTo(String value) {
            addCriterion("zysb_slm_sl10 <>", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10GreaterThan(String value) {
            addCriterion("zysb_slm_sl10 >", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl10 >=", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10LessThan(String value) {
            addCriterion("zysb_slm_sl10 <", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl10 <=", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10Like(String value) {
            addCriterion("zysb_slm_sl10 like", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10NotLike(String value) {
            addCriterion("zysb_slm_sl10 not like", value, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10In(List<String> values) {
            addCriterion("zysb_slm_sl10 in", values, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10NotIn(List<String> values) {
            addCriterion("zysb_slm_sl10 not in", values, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10Between(String value1, String value2) {
            addCriterion("zysb_slm_sl10 between", value1, value2, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl10NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl10 not between", value1, value2, "zysbSlmSl10");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11IsNull() {
            addCriterion("zysb_slm_sl11 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11IsNotNull() {
            addCriterion("zysb_slm_sl11 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11EqualTo(String value) {
            addCriterion("zysb_slm_sl11 =", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11NotEqualTo(String value) {
            addCriterion("zysb_slm_sl11 <>", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11GreaterThan(String value) {
            addCriterion("zysb_slm_sl11 >", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl11 >=", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11LessThan(String value) {
            addCriterion("zysb_slm_sl11 <", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl11 <=", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11Like(String value) {
            addCriterion("zysb_slm_sl11 like", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11NotLike(String value) {
            addCriterion("zysb_slm_sl11 not like", value, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11In(List<String> values) {
            addCriterion("zysb_slm_sl11 in", values, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11NotIn(List<String> values) {
            addCriterion("zysb_slm_sl11 not in", values, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11Between(String value1, String value2) {
            addCriterion("zysb_slm_sl11 between", value1, value2, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl11NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl11 not between", value1, value2, "zysbSlmSl11");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12IsNull() {
            addCriterion("zysb_slm_sl12 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12IsNotNull() {
            addCriterion("zysb_slm_sl12 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12EqualTo(String value) {
            addCriterion("zysb_slm_sl12 =", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12NotEqualTo(String value) {
            addCriterion("zysb_slm_sl12 <>", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12GreaterThan(String value) {
            addCriterion("zysb_slm_sl12 >", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl12 >=", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12LessThan(String value) {
            addCriterion("zysb_slm_sl12 <", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl12 <=", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12Like(String value) {
            addCriterion("zysb_slm_sl12 like", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12NotLike(String value) {
            addCriterion("zysb_slm_sl12 not like", value, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12In(List<String> values) {
            addCriterion("zysb_slm_sl12 in", values, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12NotIn(List<String> values) {
            addCriterion("zysb_slm_sl12 not in", values, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12Between(String value1, String value2) {
            addCriterion("zysb_slm_sl12 between", value1, value2, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl12NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl12 not between", value1, value2, "zysbSlmSl12");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13IsNull() {
            addCriterion("zysb_slm_sl13 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13IsNotNull() {
            addCriterion("zysb_slm_sl13 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13EqualTo(String value) {
            addCriterion("zysb_slm_sl13 =", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13NotEqualTo(String value) {
            addCriterion("zysb_slm_sl13 <>", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13GreaterThan(String value) {
            addCriterion("zysb_slm_sl13 >", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl13 >=", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13LessThan(String value) {
            addCriterion("zysb_slm_sl13 <", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl13 <=", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13Like(String value) {
            addCriterion("zysb_slm_sl13 like", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13NotLike(String value) {
            addCriterion("zysb_slm_sl13 not like", value, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13In(List<String> values) {
            addCriterion("zysb_slm_sl13 in", values, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13NotIn(List<String> values) {
            addCriterion("zysb_slm_sl13 not in", values, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13Between(String value1, String value2) {
            addCriterion("zysb_slm_sl13 between", value1, value2, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl13NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl13 not between", value1, value2, "zysbSlmSl13");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14IsNull() {
            addCriterion("zysb_slm_sl14 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14IsNotNull() {
            addCriterion("zysb_slm_sl14 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14EqualTo(String value) {
            addCriterion("zysb_slm_sl14 =", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14NotEqualTo(String value) {
            addCriterion("zysb_slm_sl14 <>", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14GreaterThan(String value) {
            addCriterion("zysb_slm_sl14 >", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl14 >=", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14LessThan(String value) {
            addCriterion("zysb_slm_sl14 <", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl14 <=", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14Like(String value) {
            addCriterion("zysb_slm_sl14 like", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14NotLike(String value) {
            addCriterion("zysb_slm_sl14 not like", value, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14In(List<String> values) {
            addCriterion("zysb_slm_sl14 in", values, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14NotIn(List<String> values) {
            addCriterion("zysb_slm_sl14 not in", values, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14Between(String value1, String value2) {
            addCriterion("zysb_slm_sl14 between", value1, value2, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl14NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl14 not between", value1, value2, "zysbSlmSl14");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15IsNull() {
            addCriterion("zysb_slm_sl15 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15IsNotNull() {
            addCriterion("zysb_slm_sl15 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15EqualTo(String value) {
            addCriterion("zysb_slm_sl15 =", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15NotEqualTo(String value) {
            addCriterion("zysb_slm_sl15 <>", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15GreaterThan(String value) {
            addCriterion("zysb_slm_sl15 >", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl15 >=", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15LessThan(String value) {
            addCriterion("zysb_slm_sl15 <", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl15 <=", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15Like(String value) {
            addCriterion("zysb_slm_sl15 like", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15NotLike(String value) {
            addCriterion("zysb_slm_sl15 not like", value, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15In(List<String> values) {
            addCriterion("zysb_slm_sl15 in", values, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15NotIn(List<String> values) {
            addCriterion("zysb_slm_sl15 not in", values, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15Between(String value1, String value2) {
            addCriterion("zysb_slm_sl15 between", value1, value2, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl15NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl15 not between", value1, value2, "zysbSlmSl15");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16IsNull() {
            addCriterion("zysb_slm_sl16 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16IsNotNull() {
            addCriterion("zysb_slm_sl16 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16EqualTo(String value) {
            addCriterion("zysb_slm_sl16 =", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16NotEqualTo(String value) {
            addCriterion("zysb_slm_sl16 <>", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16GreaterThan(String value) {
            addCriterion("zysb_slm_sl16 >", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl16 >=", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16LessThan(String value) {
            addCriterion("zysb_slm_sl16 <", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl16 <=", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16Like(String value) {
            addCriterion("zysb_slm_sl16 like", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16NotLike(String value) {
            addCriterion("zysb_slm_sl16 not like", value, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16In(List<String> values) {
            addCriterion("zysb_slm_sl16 in", values, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16NotIn(List<String> values) {
            addCriterion("zysb_slm_sl16 not in", values, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16Between(String value1, String value2) {
            addCriterion("zysb_slm_sl16 between", value1, value2, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl16NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl16 not between", value1, value2, "zysbSlmSl16");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17IsNull() {
            addCriterion("zysb_slm_sl17 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17IsNotNull() {
            addCriterion("zysb_slm_sl17 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17EqualTo(String value) {
            addCriterion("zysb_slm_sl17 =", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17NotEqualTo(String value) {
            addCriterion("zysb_slm_sl17 <>", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17GreaterThan(String value) {
            addCriterion("zysb_slm_sl17 >", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl17 >=", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17LessThan(String value) {
            addCriterion("zysb_slm_sl17 <", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl17 <=", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17Like(String value) {
            addCriterion("zysb_slm_sl17 like", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17NotLike(String value) {
            addCriterion("zysb_slm_sl17 not like", value, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17In(List<String> values) {
            addCriterion("zysb_slm_sl17 in", values, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17NotIn(List<String> values) {
            addCriterion("zysb_slm_sl17 not in", values, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17Between(String value1, String value2) {
            addCriterion("zysb_slm_sl17 between", value1, value2, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl17NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl17 not between", value1, value2, "zysbSlmSl17");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18IsNull() {
            addCriterion("zysb_slm_sl18 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18IsNotNull() {
            addCriterion("zysb_slm_sl18 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18EqualTo(String value) {
            addCriterion("zysb_slm_sl18 =", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18NotEqualTo(String value) {
            addCriterion("zysb_slm_sl18 <>", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18GreaterThan(String value) {
            addCriterion("zysb_slm_sl18 >", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl18 >=", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18LessThan(String value) {
            addCriterion("zysb_slm_sl18 <", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl18 <=", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18Like(String value) {
            addCriterion("zysb_slm_sl18 like", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18NotLike(String value) {
            addCriterion("zysb_slm_sl18 not like", value, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18In(List<String> values) {
            addCriterion("zysb_slm_sl18 in", values, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18NotIn(List<String> values) {
            addCriterion("zysb_slm_sl18 not in", values, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18Between(String value1, String value2) {
            addCriterion("zysb_slm_sl18 between", value1, value2, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl18NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl18 not between", value1, value2, "zysbSlmSl18");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19IsNull() {
            addCriterion("zysb_slm_sl19 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19IsNotNull() {
            addCriterion("zysb_slm_sl19 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19EqualTo(String value) {
            addCriterion("zysb_slm_sl19 =", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19NotEqualTo(String value) {
            addCriterion("zysb_slm_sl19 <>", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19GreaterThan(String value) {
            addCriterion("zysb_slm_sl19 >", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl19 >=", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19LessThan(String value) {
            addCriterion("zysb_slm_sl19 <", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl19 <=", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19Like(String value) {
            addCriterion("zysb_slm_sl19 like", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19NotLike(String value) {
            addCriterion("zysb_slm_sl19 not like", value, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19In(List<String> values) {
            addCriterion("zysb_slm_sl19 in", values, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19NotIn(List<String> values) {
            addCriterion("zysb_slm_sl19 not in", values, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19Between(String value1, String value2) {
            addCriterion("zysb_slm_sl19 between", value1, value2, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl19NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl19 not between", value1, value2, "zysbSlmSl19");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20IsNull() {
            addCriterion("zysb_slm_sl20 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20IsNotNull() {
            addCriterion("zysb_slm_sl20 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20EqualTo(String value) {
            addCriterion("zysb_slm_sl20 =", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20NotEqualTo(String value) {
            addCriterion("zysb_slm_sl20 <>", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20GreaterThan(String value) {
            addCriterion("zysb_slm_sl20 >", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl20 >=", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20LessThan(String value) {
            addCriterion("zysb_slm_sl20 <", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl20 <=", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20Like(String value) {
            addCriterion("zysb_slm_sl20 like", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20NotLike(String value) {
            addCriterion("zysb_slm_sl20 not like", value, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20In(List<String> values) {
            addCriterion("zysb_slm_sl20 in", values, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20NotIn(List<String> values) {
            addCriterion("zysb_slm_sl20 not in", values, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20Between(String value1, String value2) {
            addCriterion("zysb_slm_sl20 between", value1, value2, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl20NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl20 not between", value1, value2, "zysbSlmSl20");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21IsNull() {
            addCriterion("zysb_slm_sl21 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21IsNotNull() {
            addCriterion("zysb_slm_sl21 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21EqualTo(String value) {
            addCriterion("zysb_slm_sl21 =", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21NotEqualTo(String value) {
            addCriterion("zysb_slm_sl21 <>", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21GreaterThan(String value) {
            addCriterion("zysb_slm_sl21 >", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl21 >=", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21LessThan(String value) {
            addCriterion("zysb_slm_sl21 <", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl21 <=", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21Like(String value) {
            addCriterion("zysb_slm_sl21 like", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21NotLike(String value) {
            addCriterion("zysb_slm_sl21 not like", value, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21In(List<String> values) {
            addCriterion("zysb_slm_sl21 in", values, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21NotIn(List<String> values) {
            addCriterion("zysb_slm_sl21 not in", values, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21Between(String value1, String value2) {
            addCriterion("zysb_slm_sl21 between", value1, value2, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl21NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl21 not between", value1, value2, "zysbSlmSl21");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22IsNull() {
            addCriterion("zysb_slm_sl22 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22IsNotNull() {
            addCriterion("zysb_slm_sl22 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22EqualTo(String value) {
            addCriterion("zysb_slm_sl22 =", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22NotEqualTo(String value) {
            addCriterion("zysb_slm_sl22 <>", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22GreaterThan(String value) {
            addCriterion("zysb_slm_sl22 >", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl22 >=", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22LessThan(String value) {
            addCriterion("zysb_slm_sl22 <", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl22 <=", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22Like(String value) {
            addCriterion("zysb_slm_sl22 like", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22NotLike(String value) {
            addCriterion("zysb_slm_sl22 not like", value, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22In(List<String> values) {
            addCriterion("zysb_slm_sl22 in", values, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22NotIn(List<String> values) {
            addCriterion("zysb_slm_sl22 not in", values, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22Between(String value1, String value2) {
            addCriterion("zysb_slm_sl22 between", value1, value2, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl22NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl22 not between", value1, value2, "zysbSlmSl22");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23IsNull() {
            addCriterion("zysb_slm_sl23 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23IsNotNull() {
            addCriterion("zysb_slm_sl23 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23EqualTo(String value) {
            addCriterion("zysb_slm_sl23 =", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23NotEqualTo(String value) {
            addCriterion("zysb_slm_sl23 <>", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23GreaterThan(String value) {
            addCriterion("zysb_slm_sl23 >", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl23 >=", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23LessThan(String value) {
            addCriterion("zysb_slm_sl23 <", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl23 <=", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23Like(String value) {
            addCriterion("zysb_slm_sl23 like", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23NotLike(String value) {
            addCriterion("zysb_slm_sl23 not like", value, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23In(List<String> values) {
            addCriterion("zysb_slm_sl23 in", values, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23NotIn(List<String> values) {
            addCriterion("zysb_slm_sl23 not in", values, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23Between(String value1, String value2) {
            addCriterion("zysb_slm_sl23 between", value1, value2, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl23NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl23 not between", value1, value2, "zysbSlmSl23");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24IsNull() {
            addCriterion("zysb_slm_sl24 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24IsNotNull() {
            addCriterion("zysb_slm_sl24 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24EqualTo(String value) {
            addCriterion("zysb_slm_sl24 =", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24NotEqualTo(String value) {
            addCriterion("zysb_slm_sl24 <>", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24GreaterThan(String value) {
            addCriterion("zysb_slm_sl24 >", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl24 >=", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24LessThan(String value) {
            addCriterion("zysb_slm_sl24 <", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl24 <=", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24Like(String value) {
            addCriterion("zysb_slm_sl24 like", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24NotLike(String value) {
            addCriterion("zysb_slm_sl24 not like", value, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24In(List<String> values) {
            addCriterion("zysb_slm_sl24 in", values, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24NotIn(List<String> values) {
            addCriterion("zysb_slm_sl24 not in", values, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24Between(String value1, String value2) {
            addCriterion("zysb_slm_sl24 between", value1, value2, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl24NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl24 not between", value1, value2, "zysbSlmSl24");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25IsNull() {
            addCriterion("zysb_slm_sl25 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25IsNotNull() {
            addCriterion("zysb_slm_sl25 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25EqualTo(String value) {
            addCriterion("zysb_slm_sl25 =", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25NotEqualTo(String value) {
            addCriterion("zysb_slm_sl25 <>", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25GreaterThan(String value) {
            addCriterion("zysb_slm_sl25 >", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl25 >=", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25LessThan(String value) {
            addCriterion("zysb_slm_sl25 <", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl25 <=", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25Like(String value) {
            addCriterion("zysb_slm_sl25 like", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25NotLike(String value) {
            addCriterion("zysb_slm_sl25 not like", value, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25In(List<String> values) {
            addCriterion("zysb_slm_sl25 in", values, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25NotIn(List<String> values) {
            addCriterion("zysb_slm_sl25 not in", values, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25Between(String value1, String value2) {
            addCriterion("zysb_slm_sl25 between", value1, value2, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl25NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl25 not between", value1, value2, "zysbSlmSl25");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26IsNull() {
            addCriterion("zysb_slm_sl26 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26IsNotNull() {
            addCriterion("zysb_slm_sl26 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26EqualTo(String value) {
            addCriterion("zysb_slm_sl26 =", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26NotEqualTo(String value) {
            addCriterion("zysb_slm_sl26 <>", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26GreaterThan(String value) {
            addCriterion("zysb_slm_sl26 >", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl26 >=", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26LessThan(String value) {
            addCriterion("zysb_slm_sl26 <", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl26 <=", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26Like(String value) {
            addCriterion("zysb_slm_sl26 like", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26NotLike(String value) {
            addCriterion("zysb_slm_sl26 not like", value, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26In(List<String> values) {
            addCriterion("zysb_slm_sl26 in", values, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26NotIn(List<String> values) {
            addCriterion("zysb_slm_sl26 not in", values, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26Between(String value1, String value2) {
            addCriterion("zysb_slm_sl26 between", value1, value2, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl26NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl26 not between", value1, value2, "zysbSlmSl26");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27IsNull() {
            addCriterion("zysb_slm_sl27 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27IsNotNull() {
            addCriterion("zysb_slm_sl27 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27EqualTo(String value) {
            addCriterion("zysb_slm_sl27 =", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27NotEqualTo(String value) {
            addCriterion("zysb_slm_sl27 <>", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27GreaterThan(String value) {
            addCriterion("zysb_slm_sl27 >", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl27 >=", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27LessThan(String value) {
            addCriterion("zysb_slm_sl27 <", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl27 <=", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27Like(String value) {
            addCriterion("zysb_slm_sl27 like", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27NotLike(String value) {
            addCriterion("zysb_slm_sl27 not like", value, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27In(List<String> values) {
            addCriterion("zysb_slm_sl27 in", values, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27NotIn(List<String> values) {
            addCriterion("zysb_slm_sl27 not in", values, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27Between(String value1, String value2) {
            addCriterion("zysb_slm_sl27 between", value1, value2, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl27NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl27 not between", value1, value2, "zysbSlmSl27");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28IsNull() {
            addCriterion("zysb_slm_sl28 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28IsNotNull() {
            addCriterion("zysb_slm_sl28 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28EqualTo(String value) {
            addCriterion("zysb_slm_sl28 =", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28NotEqualTo(String value) {
            addCriterion("zysb_slm_sl28 <>", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28GreaterThan(String value) {
            addCriterion("zysb_slm_sl28 >", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl28 >=", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28LessThan(String value) {
            addCriterion("zysb_slm_sl28 <", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl28 <=", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28Like(String value) {
            addCriterion("zysb_slm_sl28 like", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28NotLike(String value) {
            addCriterion("zysb_slm_sl28 not like", value, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28In(List<String> values) {
            addCriterion("zysb_slm_sl28 in", values, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28NotIn(List<String> values) {
            addCriterion("zysb_slm_sl28 not in", values, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28Between(String value1, String value2) {
            addCriterion("zysb_slm_sl28 between", value1, value2, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl28NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl28 not between", value1, value2, "zysbSlmSl28");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29IsNull() {
            addCriterion("zysb_slm_sl29 is null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29IsNotNull() {
            addCriterion("zysb_slm_sl29 is not null");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29EqualTo(String value) {
            addCriterion("zysb_slm_sl29 =", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29NotEqualTo(String value) {
            addCriterion("zysb_slm_sl29 <>", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29GreaterThan(String value) {
            addCriterion("zysb_slm_sl29 >", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29GreaterThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl29 >=", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29LessThan(String value) {
            addCriterion("zysb_slm_sl29 <", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29LessThanOrEqualTo(String value) {
            addCriterion("zysb_slm_sl29 <=", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29Like(String value) {
            addCriterion("zysb_slm_sl29 like", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29NotLike(String value) {
            addCriterion("zysb_slm_sl29 not like", value, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29In(List<String> values) {
            addCriterion("zysb_slm_sl29 in", values, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29NotIn(List<String> values) {
            addCriterion("zysb_slm_sl29 not in", values, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29Between(String value1, String value2) {
            addCriterion("zysb_slm_sl29 between", value1, value2, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andZysbSlmSl29NotBetween(String value1, String value2) {
            addCriterion("zysb_slm_sl29 not between", value1, value2, "zysbSlmSl29");
            return (Criteria) this;
        }

        public Criteria andFmfs0IsNull() {
            addCriterion("fmfs0 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs0IsNotNull() {
            addCriterion("fmfs0 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs0EqualTo(String value) {
            addCriterion("fmfs0 =", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0NotEqualTo(String value) {
            addCriterion("fmfs0 <>", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0GreaterThan(String value) {
            addCriterion("fmfs0 >", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs0 >=", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0LessThan(String value) {
            addCriterion("fmfs0 <", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0LessThanOrEqualTo(String value) {
            addCriterion("fmfs0 <=", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0Like(String value) {
            addCriterion("fmfs0 like", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0NotLike(String value) {
            addCriterion("fmfs0 not like", value, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0In(List<String> values) {
            addCriterion("fmfs0 in", values, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0NotIn(List<String> values) {
            addCriterion("fmfs0 not in", values, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0Between(String value1, String value2) {
            addCriterion("fmfs0 between", value1, value2, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs0NotBetween(String value1, String value2) {
            addCriterion("fmfs0 not between", value1, value2, "fmfs0");
            return (Criteria) this;
        }

        public Criteria andFmfs1IsNull() {
            addCriterion("fmfs1 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs1IsNotNull() {
            addCriterion("fmfs1 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs1EqualTo(String value) {
            addCriterion("fmfs1 =", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1NotEqualTo(String value) {
            addCriterion("fmfs1 <>", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1GreaterThan(String value) {
            addCriterion("fmfs1 >", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs1 >=", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1LessThan(String value) {
            addCriterion("fmfs1 <", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1LessThanOrEqualTo(String value) {
            addCriterion("fmfs1 <=", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1Like(String value) {
            addCriterion("fmfs1 like", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1NotLike(String value) {
            addCriterion("fmfs1 not like", value, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1In(List<String> values) {
            addCriterion("fmfs1 in", values, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1NotIn(List<String> values) {
            addCriterion("fmfs1 not in", values, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1Between(String value1, String value2) {
            addCriterion("fmfs1 between", value1, value2, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs1NotBetween(String value1, String value2) {
            addCriterion("fmfs1 not between", value1, value2, "fmfs1");
            return (Criteria) this;
        }

        public Criteria andFmfs2IsNull() {
            addCriterion("fmfs2 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs2IsNotNull() {
            addCriterion("fmfs2 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs2EqualTo(String value) {
            addCriterion("fmfs2 =", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2NotEqualTo(String value) {
            addCriterion("fmfs2 <>", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2GreaterThan(String value) {
            addCriterion("fmfs2 >", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs2 >=", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2LessThan(String value) {
            addCriterion("fmfs2 <", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2LessThanOrEqualTo(String value) {
            addCriterion("fmfs2 <=", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2Like(String value) {
            addCriterion("fmfs2 like", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2NotLike(String value) {
            addCriterion("fmfs2 not like", value, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2In(List<String> values) {
            addCriterion("fmfs2 in", values, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2NotIn(List<String> values) {
            addCriterion("fmfs2 not in", values, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2Between(String value1, String value2) {
            addCriterion("fmfs2 between", value1, value2, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs2NotBetween(String value1, String value2) {
            addCriterion("fmfs2 not between", value1, value2, "fmfs2");
            return (Criteria) this;
        }

        public Criteria andFmfs3IsNull() {
            addCriterion("fmfs3 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs3IsNotNull() {
            addCriterion("fmfs3 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs3EqualTo(String value) {
            addCriterion("fmfs3 =", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3NotEqualTo(String value) {
            addCriterion("fmfs3 <>", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3GreaterThan(String value) {
            addCriterion("fmfs3 >", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs3 >=", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3LessThan(String value) {
            addCriterion("fmfs3 <", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3LessThanOrEqualTo(String value) {
            addCriterion("fmfs3 <=", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3Like(String value) {
            addCriterion("fmfs3 like", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3NotLike(String value) {
            addCriterion("fmfs3 not like", value, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3In(List<String> values) {
            addCriterion("fmfs3 in", values, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3NotIn(List<String> values) {
            addCriterion("fmfs3 not in", values, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3Between(String value1, String value2) {
            addCriterion("fmfs3 between", value1, value2, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs3NotBetween(String value1, String value2) {
            addCriterion("fmfs3 not between", value1, value2, "fmfs3");
            return (Criteria) this;
        }

        public Criteria andFmfs4IsNull() {
            addCriterion("fmfs4 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs4IsNotNull() {
            addCriterion("fmfs4 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs4EqualTo(String value) {
            addCriterion("fmfs4 =", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4NotEqualTo(String value) {
            addCriterion("fmfs4 <>", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4GreaterThan(String value) {
            addCriterion("fmfs4 >", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs4 >=", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4LessThan(String value) {
            addCriterion("fmfs4 <", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4LessThanOrEqualTo(String value) {
            addCriterion("fmfs4 <=", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4Like(String value) {
            addCriterion("fmfs4 like", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4NotLike(String value) {
            addCriterion("fmfs4 not like", value, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4In(List<String> values) {
            addCriterion("fmfs4 in", values, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4NotIn(List<String> values) {
            addCriterion("fmfs4 not in", values, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4Between(String value1, String value2) {
            addCriterion("fmfs4 between", value1, value2, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs4NotBetween(String value1, String value2) {
            addCriterion("fmfs4 not between", value1, value2, "fmfs4");
            return (Criteria) this;
        }

        public Criteria andFmfs5IsNull() {
            addCriterion("fmfs5 is null");
            return (Criteria) this;
        }

        public Criteria andFmfs5IsNotNull() {
            addCriterion("fmfs5 is not null");
            return (Criteria) this;
        }

        public Criteria andFmfs5EqualTo(String value) {
            addCriterion("fmfs5 =", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5NotEqualTo(String value) {
            addCriterion("fmfs5 <>", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5GreaterThan(String value) {
            addCriterion("fmfs5 >", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5GreaterThanOrEqualTo(String value) {
            addCriterion("fmfs5 >=", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5LessThan(String value) {
            addCriterion("fmfs5 <", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5LessThanOrEqualTo(String value) {
            addCriterion("fmfs5 <=", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5Like(String value) {
            addCriterion("fmfs5 like", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5NotLike(String value) {
            addCriterion("fmfs5 not like", value, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5In(List<String> values) {
            addCriterion("fmfs5 in", values, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5NotIn(List<String> values) {
            addCriterion("fmfs5 not in", values, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5Between(String value1, String value2) {
            addCriterion("fmfs5 between", value1, value2, "fmfs5");
            return (Criteria) this;
        }

        public Criteria andFmfs5NotBetween(String value1, String value2) {
            addCriterion("fmfs5 not between", value1, value2, "fmfs5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}