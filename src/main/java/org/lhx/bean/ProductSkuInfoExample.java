package org.lhx.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSkuInfoExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNull() {
            addCriterion("product_colour is null");
            return (Criteria) this;
        }

        public Criteria andProductColourIsNotNull() {
            addCriterion("product_colour is not null");
            return (Criteria) this;
        }

        public Criteria andProductColourEqualTo(Integer value) {
            addCriterion("product_colour =", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotEqualTo(Integer value) {
            addCriterion("product_colour <>", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThan(Integer value) {
            addCriterion("product_colour >", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_colour >=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThan(Integer value) {
            addCriterion("product_colour <", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourLessThanOrEqualTo(Integer value) {
            addCriterion("product_colour <=", value, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourIn(List<Integer> values) {
            addCriterion("product_colour in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotIn(List<Integer> values) {
            addCriterion("product_colour not in", values, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourBetween(Integer value1, Integer value2) {
            addCriterion("product_colour between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProductColourNotBetween(Integer value1, Integer value2) {
            addCriterion("product_colour not between", value1, value2, "productColour");
            return (Criteria) this;
        }

        public Criteria andProudctVersionIsNull() {
            addCriterion("proudct_version is null");
            return (Criteria) this;
        }

        public Criteria andProudctVersionIsNotNull() {
            addCriterion("proudct_version is not null");
            return (Criteria) this;
        }

        public Criteria andProudctVersionEqualTo(Integer value) {
            addCriterion("proudct_version =", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionNotEqualTo(Integer value) {
            addCriterion("proudct_version <>", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionGreaterThan(Integer value) {
            addCriterion("proudct_version >", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("proudct_version >=", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionLessThan(Integer value) {
            addCriterion("proudct_version <", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionLessThanOrEqualTo(Integer value) {
            addCriterion("proudct_version <=", value, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionIn(List<Integer> values) {
            addCriterion("proudct_version in", values, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionNotIn(List<Integer> values) {
            addCriterion("proudct_version not in", values, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionBetween(Integer value1, Integer value2) {
            addCriterion("proudct_version between", value1, value2, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProudctVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("proudct_version not between", value1, value2, "proudctVersion");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("\"product description\" is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("\"product description\" is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("\"product description\" =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("\"product description\" <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("\"product description\" >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("\"product description\" >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("\"product description\" <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("\"product description\" <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("\"product description\" like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("\"product description\" not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("\"product description\" in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("\"product description\" not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("\"product description\" between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("\"product description\" not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("product_weight like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("product_weight not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNull() {
            addCriterion("product_size is null");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNotNull() {
            addCriterion("product_size is not null");
            return (Criteria) this;
        }

        public Criteria andProductSizeEqualTo(String value) {
            addCriterion("product_size =", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotEqualTo(String value) {
            addCriterion("product_size <>", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThan(String value) {
            addCriterion("product_size >", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThanOrEqualTo(String value) {
            addCriterion("product_size >=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThan(String value) {
            addCriterion("product_size <", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThanOrEqualTo(String value) {
            addCriterion("product_size <=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLike(String value) {
            addCriterion("product_size like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotLike(String value) {
            addCriterion("product_size not like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeIn(List<String> values) {
            addCriterion("product_size in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotIn(List<String> values) {
            addCriterion("product_size not in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeBetween(String value1, String value2) {
            addCriterion("product_size between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotBetween(String value1, String value2) {
            addCriterion("product_size not between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
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