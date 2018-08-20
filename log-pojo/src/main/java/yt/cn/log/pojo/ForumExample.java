package yt.cn.log.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFTitleIsNull() {
            addCriterion("f_title is null");
            return (Criteria) this;
        }

        public Criteria andFTitleIsNotNull() {
            addCriterion("f_title is not null");
            return (Criteria) this;
        }

        public Criteria andFTitleEqualTo(String value) {
            addCriterion("f_title =", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotEqualTo(String value) {
            addCriterion("f_title <>", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleGreaterThan(String value) {
            addCriterion("f_title >", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleGreaterThanOrEqualTo(String value) {
            addCriterion("f_title >=", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLessThan(String value) {
            addCriterion("f_title <", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLessThanOrEqualTo(String value) {
            addCriterion("f_title <=", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLike(String value) {
            addCriterion("f_title like", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotLike(String value) {
            addCriterion("f_title not like", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleIn(List<String> values) {
            addCriterion("f_title in", values, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotIn(List<String> values) {
            addCriterion("f_title not in", values, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleBetween(String value1, String value2) {
            addCriterion("f_title between", value1, value2, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotBetween(String value1, String value2) {
            addCriterion("f_title not between", value1, value2, "fTitle");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFAuthorIsNull() {
            addCriterion("f_author is null");
            return (Criteria) this;
        }

        public Criteria andFAuthorIsNotNull() {
            addCriterion("f_author is not null");
            return (Criteria) this;
        }

        public Criteria andFAuthorEqualTo(String value) {
            addCriterion("f_author =", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotEqualTo(String value) {
            addCriterion("f_author <>", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorGreaterThan(String value) {
            addCriterion("f_author >", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("f_author >=", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLessThan(String value) {
            addCriterion("f_author <", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLessThanOrEqualTo(String value) {
            addCriterion("f_author <=", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorLike(String value) {
            addCriterion("f_author like", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotLike(String value) {
            addCriterion("f_author not like", value, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorIn(List<String> values) {
            addCriterion("f_author in", values, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotIn(List<String> values) {
            addCriterion("f_author not in", values, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorBetween(String value1, String value2) {
            addCriterion("f_author between", value1, value2, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andFAuthorNotBetween(String value1, String value2) {
            addCriterion("f_author not between", value1, value2, "fAuthor");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Integer value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Integer value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Integer value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Integer value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Integer> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Integer> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Integer value1, Integer value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andRepliesIsNull() {
            addCriterion("replies is null");
            return (Criteria) this;
        }

        public Criteria andRepliesIsNotNull() {
            addCriterion("replies is not null");
            return (Criteria) this;
        }

        public Criteria andRepliesEqualTo(Integer value) {
            addCriterion("replies =", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotEqualTo(Integer value) {
            addCriterion("replies <>", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesGreaterThan(Integer value) {
            addCriterion("replies >", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesGreaterThanOrEqualTo(Integer value) {
            addCriterion("replies >=", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesLessThan(Integer value) {
            addCriterion("replies <", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesLessThanOrEqualTo(Integer value) {
            addCriterion("replies <=", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesIn(List<Integer> values) {
            addCriterion("replies in", values, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotIn(List<Integer> values) {
            addCriterion("replies not in", values, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesBetween(Integer value1, Integer value2) {
            addCriterion("replies between", value1, value2, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotBetween(Integer value1, Integer value2) {
            addCriterion("replies not between", value1, value2, "replies");
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