package com.bootdo.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(String value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(String value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(String value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(String value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(String value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLike(String value) {
            addCriterion("project_status like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotLike(String value) {
            addCriterion("project_status not like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<String> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<String> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(String value1, String value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(String value1, String value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectYearIsNull() {
            addCriterion("project_year is null");
            return (Criteria) this;
        }

        public Criteria andProjectYearIsNotNull() {
            addCriterion("project_year is not null");
            return (Criteria) this;
        }

        public Criteria andProjectYearEqualTo(String value) {
            addCriterion("project_year =", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearNotEqualTo(String value) {
            addCriterion("project_year <>", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearGreaterThan(String value) {
            addCriterion("project_year >", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearGreaterThanOrEqualTo(String value) {
            addCriterion("project_year >=", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearLessThan(String value) {
            addCriterion("project_year <", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearLessThanOrEqualTo(String value) {
            addCriterion("project_year <=", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearLike(String value) {
            addCriterion("project_year like", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearNotLike(String value) {
            addCriterion("project_year not like", value, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearIn(List<String> values) {
            addCriterion("project_year in", values, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearNotIn(List<String> values) {
            addCriterion("project_year not in", values, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearBetween(String value1, String value2) {
            addCriterion("project_year between", value1, value2, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectYearNotBetween(String value1, String value2) {
            addCriterion("project_year not between", value1, value2, "projectYear");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitIsNull() {
            addCriterion("customer_unit is null");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitIsNotNull() {
            addCriterion("customer_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitEqualTo(String value) {
            addCriterion("customer_unit =", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitNotEqualTo(String value) {
            addCriterion("customer_unit <>", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitGreaterThan(String value) {
            addCriterion("customer_unit >", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitGreaterThanOrEqualTo(String value) {
            addCriterion("customer_unit >=", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitLessThan(String value) {
            addCriterion("customer_unit <", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitLessThanOrEqualTo(String value) {
            addCriterion("customer_unit <=", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitLike(String value) {
            addCriterion("customer_unit like", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitNotLike(String value) {
            addCriterion("customer_unit not like", value, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitIn(List<String> values) {
            addCriterion("customer_unit in", values, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitNotIn(List<String> values) {
            addCriterion("customer_unit not in", values, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitBetween(String value1, String value2) {
            addCriterion("customer_unit between", value1, value2, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerUnitNotBetween(String value1, String value2) {
            addCriterion("customer_unit not between", value1, value2, "customerUnit");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsIsNull() {
            addCriterion("customer_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsIsNotNull() {
            addCriterion("customer_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsEqualTo(String value) {
            addCriterion("customer_contactor_ids =", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsNotEqualTo(String value) {
            addCriterion("customer_contactor_ids <>", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsGreaterThan(String value) {
            addCriterion("customer_contactor_ids >", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contactor_ids >=", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsLessThan(String value) {
            addCriterion("customer_contactor_ids <", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("customer_contactor_ids <=", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsLike(String value) {
            addCriterion("customer_contactor_ids like", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsNotLike(String value) {
            addCriterion("customer_contactor_ids not like", value, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsIn(List<String> values) {
            addCriterion("customer_contactor_ids in", values, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsNotIn(List<String> values) {
            addCriterion("customer_contactor_ids not in", values, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsBetween(String value1, String value2) {
            addCriterion("customer_contactor_ids between", value1, value2, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContactorIdsNotBetween(String value1, String value2) {
            addCriterion("customer_contactor_ids not between", value1, value2, "customerContactorIds");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitIsNull() {
            addCriterion("follower_unit is null");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitIsNotNull() {
            addCriterion("follower_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitEqualTo(String value) {
            addCriterion("follower_unit =", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitNotEqualTo(String value) {
            addCriterion("follower_unit <>", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitGreaterThan(String value) {
            addCriterion("follower_unit >", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitGreaterThanOrEqualTo(String value) {
            addCriterion("follower_unit >=", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitLessThan(String value) {
            addCriterion("follower_unit <", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitLessThanOrEqualTo(String value) {
            addCriterion("follower_unit <=", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitLike(String value) {
            addCriterion("follower_unit like", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitNotLike(String value) {
            addCriterion("follower_unit not like", value, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitIn(List<String> values) {
            addCriterion("follower_unit in", values, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitNotIn(List<String> values) {
            addCriterion("follower_unit not in", values, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitBetween(String value1, String value2) {
            addCriterion("follower_unit between", value1, value2, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerUnitNotBetween(String value1, String value2) {
            addCriterion("follower_unit not between", value1, value2, "followerUnit");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsIsNull() {
            addCriterion("follower_ids is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsIsNotNull() {
            addCriterion("follower_ids is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsEqualTo(String value) {
            addCriterion("follower_ids =", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsNotEqualTo(String value) {
            addCriterion("follower_ids <>", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsGreaterThan(String value) {
            addCriterion("follower_ids >", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsGreaterThanOrEqualTo(String value) {
            addCriterion("follower_ids >=", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsLessThan(String value) {
            addCriterion("follower_ids <", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsLessThanOrEqualTo(String value) {
            addCriterion("follower_ids <=", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsLike(String value) {
            addCriterion("follower_ids like", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsNotLike(String value) {
            addCriterion("follower_ids not like", value, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsIn(List<String> values) {
            addCriterion("follower_ids in", values, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsNotIn(List<String> values) {
            addCriterion("follower_ids not in", values, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsBetween(String value1, String value2) {
            addCriterion("follower_ids between", value1, value2, "followerIds");
            return (Criteria) this;
        }

        public Criteria andFollowerIdsNotBetween(String value1, String value2) {
            addCriterion("follower_ids not between", value1, value2, "followerIds");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoIsNull() {
            addCriterion("project_participate_info is null");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoIsNotNull() {
            addCriterion("project_participate_info is not null");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoEqualTo(String value) {
            addCriterion("project_participate_info =", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoNotEqualTo(String value) {
            addCriterion("project_participate_info <>", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoGreaterThan(String value) {
            addCriterion("project_participate_info >", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoGreaterThanOrEqualTo(String value) {
            addCriterion("project_participate_info >=", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoLessThan(String value) {
            addCriterion("project_participate_info <", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoLessThanOrEqualTo(String value) {
            addCriterion("project_participate_info <=", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoLike(String value) {
            addCriterion("project_participate_info like", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoNotLike(String value) {
            addCriterion("project_participate_info not like", value, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoIn(List<String> values) {
            addCriterion("project_participate_info in", values, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoNotIn(List<String> values) {
            addCriterion("project_participate_info not in", values, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoBetween(String value1, String value2) {
            addCriterion("project_participate_info between", value1, value2, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andProjectParticipateInfoNotBetween(String value1, String value2) {
            addCriterion("project_participate_info not between", value1, value2, "projectParticipateInfo");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathIsNull() {
            addCriterion("solution_file_path is null");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathIsNotNull() {
            addCriterion("solution_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathEqualTo(String value) {
            addCriterion("solution_file_path =", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathNotEqualTo(String value) {
            addCriterion("solution_file_path <>", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathGreaterThan(String value) {
            addCriterion("solution_file_path >", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("solution_file_path >=", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathLessThan(String value) {
            addCriterion("solution_file_path <", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathLessThanOrEqualTo(String value) {
            addCriterion("solution_file_path <=", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathLike(String value) {
            addCriterion("solution_file_path like", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathNotLike(String value) {
            addCriterion("solution_file_path not like", value, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathIn(List<String> values) {
            addCriterion("solution_file_path in", values, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathNotIn(List<String> values) {
            addCriterion("solution_file_path not in", values, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathBetween(String value1, String value2) {
            addCriterion("solution_file_path between", value1, value2, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andSolutionFilePathNotBetween(String value1, String value2) {
            addCriterion("solution_file_path not between", value1, value2, "solutionFilePath");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIsNull() {
            addCriterion("project_budget is null");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIsNotNull() {
            addCriterion("project_budget is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetEqualTo(BigDecimal value) {
            addCriterion("project_budget =", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotEqualTo(BigDecimal value) {
            addCriterion("project_budget <>", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetGreaterThan(BigDecimal value) {
            addCriterion("project_budget >", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_budget >=", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetLessThan(BigDecimal value) {
            addCriterion("project_budget <", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_budget <=", value, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetIn(List<BigDecimal> values) {
            addCriterion("project_budget in", values, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotIn(List<BigDecimal> values) {
            addCriterion("project_budget not in", values, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_budget between", value1, value2, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectBudgetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_budget not between", value1, value2, "projectBudget");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathIsNull() {
            addCriterion("project_notice_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathIsNotNull() {
            addCriterion("project_notice_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathEqualTo(String value) {
            addCriterion("project_notice_path =", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathNotEqualTo(String value) {
            addCriterion("project_notice_path <>", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathGreaterThan(String value) {
            addCriterion("project_notice_path >", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathGreaterThanOrEqualTo(String value) {
            addCriterion("project_notice_path >=", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathLessThan(String value) {
            addCriterion("project_notice_path <", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathLessThanOrEqualTo(String value) {
            addCriterion("project_notice_path <=", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathLike(String value) {
            addCriterion("project_notice_path like", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathNotLike(String value) {
            addCriterion("project_notice_path not like", value, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathIn(List<String> values) {
            addCriterion("project_notice_path in", values, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathNotIn(List<String> values) {
            addCriterion("project_notice_path not in", values, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathBetween(String value1, String value2) {
            addCriterion("project_notice_path between", value1, value2, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticePathNotBetween(String value1, String value2) {
            addCriterion("project_notice_path not between", value1, value2, "projectNoticePath");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgIsNull() {
            addCriterion("project_notice_img is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgIsNotNull() {
            addCriterion("project_notice_img is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgEqualTo(String value) {
            addCriterion("project_notice_img =", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgNotEqualTo(String value) {
            addCriterion("project_notice_img <>", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgGreaterThan(String value) {
            addCriterion("project_notice_img >", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgGreaterThanOrEqualTo(String value) {
            addCriterion("project_notice_img >=", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgLessThan(String value) {
            addCriterion("project_notice_img <", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgLessThanOrEqualTo(String value) {
            addCriterion("project_notice_img <=", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgLike(String value) {
            addCriterion("project_notice_img like", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgNotLike(String value) {
            addCriterion("project_notice_img not like", value, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgIn(List<String> values) {
            addCriterion("project_notice_img in", values, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgNotIn(List<String> values) {
            addCriterion("project_notice_img not in", values, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgBetween(String value1, String value2) {
            addCriterion("project_notice_img between", value1, value2, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeImgNotBetween(String value1, String value2) {
            addCriterion("project_notice_img not between", value1, value2, "projectNoticeImg");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileIsNull() {
            addCriterion("project_notice_file is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileIsNotNull() {
            addCriterion("project_notice_file is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileEqualTo(String value) {
            addCriterion("project_notice_file =", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileNotEqualTo(String value) {
            addCriterion("project_notice_file <>", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileGreaterThan(String value) {
            addCriterion("project_notice_file >", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileGreaterThanOrEqualTo(String value) {
            addCriterion("project_notice_file >=", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileLessThan(String value) {
            addCriterion("project_notice_file <", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileLessThanOrEqualTo(String value) {
            addCriterion("project_notice_file <=", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileLike(String value) {
            addCriterion("project_notice_file like", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileNotLike(String value) {
            addCriterion("project_notice_file not like", value, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileIn(List<String> values) {
            addCriterion("project_notice_file in", values, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileNotIn(List<String> values) {
            addCriterion("project_notice_file not in", values, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileBetween(String value1, String value2) {
            addCriterion("project_notice_file between", value1, value2, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeFileNotBetween(String value1, String value2) {
            addCriterion("project_notice_file not between", value1, value2, "projectNoticeFile");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeIsNull() {
            addCriterion("project_notice_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeIsNotNull() {
            addCriterion("project_notice_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeEqualTo(Boolean value) {
            addCriterion("project_notice_type =", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeNotEqualTo(Boolean value) {
            addCriterion("project_notice_type <>", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeGreaterThan(Boolean value) {
            addCriterion("project_notice_type >", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("project_notice_type >=", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeLessThan(Boolean value) {
            addCriterion("project_notice_type <", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("project_notice_type <=", value, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeIn(List<Boolean> values) {
            addCriterion("project_notice_type in", values, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeNotIn(List<Boolean> values) {
            addCriterion("project_notice_type not in", values, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("project_notice_type between", value1, value2, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andProjectNoticeTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("project_notice_type not between", value1, value2, "projectNoticeType");
            return (Criteria) this;
        }

        public Criteria andRegiDateIsNull() {
            addCriterion("regi_date is null");
            return (Criteria) this;
        }

        public Criteria andRegiDateIsNotNull() {
            addCriterion("regi_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegiDateEqualTo(Date value) {
            addCriterion("regi_date =", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateNotEqualTo(Date value) {
            addCriterion("regi_date <>", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateGreaterThan(Date value) {
            addCriterion("regi_date >", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regi_date >=", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateLessThan(Date value) {
            addCriterion("regi_date <", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateLessThanOrEqualTo(Date value) {
            addCriterion("regi_date <=", value, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateIn(List<Date> values) {
            addCriterion("regi_date in", values, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateNotIn(List<Date> values) {
            addCriterion("regi_date not in", values, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateBetween(Date value1, Date value2) {
            addCriterion("regi_date between", value1, value2, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiDateNotBetween(Date value1, Date value2) {
            addCriterion("regi_date not between", value1, value2, "regiDate");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceIsNull() {
            addCriterion("regi_place is null");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceIsNotNull() {
            addCriterion("regi_place is not null");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceEqualTo(String value) {
            addCriterion("regi_place =", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceNotEqualTo(String value) {
            addCriterion("regi_place <>", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceGreaterThan(String value) {
            addCriterion("regi_place >", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("regi_place >=", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceLessThan(String value) {
            addCriterion("regi_place <", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceLessThanOrEqualTo(String value) {
            addCriterion("regi_place <=", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceLike(String value) {
            addCriterion("regi_place like", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceNotLike(String value) {
            addCriterion("regi_place not like", value, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceIn(List<String> values) {
            addCriterion("regi_place in", values, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceNotIn(List<String> values) {
            addCriterion("regi_place not in", values, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceBetween(String value1, String value2) {
            addCriterion("regi_place between", value1, value2, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiPlaceNotBetween(String value1, String value2) {
            addCriterion("regi_place not between", value1, value2, "regiPlace");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsIsNull() {
            addCriterion("regi_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsIsNotNull() {
            addCriterion("regi_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsEqualTo(String value) {
            addCriterion("regi_contactor_ids =", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsNotEqualTo(String value) {
            addCriterion("regi_contactor_ids <>", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsGreaterThan(String value) {
            addCriterion("regi_contactor_ids >", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("regi_contactor_ids >=", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsLessThan(String value) {
            addCriterion("regi_contactor_ids <", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("regi_contactor_ids <=", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsLike(String value) {
            addCriterion("regi_contactor_ids like", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsNotLike(String value) {
            addCriterion("regi_contactor_ids not like", value, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsIn(List<String> values) {
            addCriterion("regi_contactor_ids in", values, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsNotIn(List<String> values) {
            addCriterion("regi_contactor_ids not in", values, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsBetween(String value1, String value2) {
            addCriterion("regi_contactor_ids between", value1, value2, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiContactorIdsNotBetween(String value1, String value2) {
            addCriterion("regi_contactor_ids not between", value1, value2, "regiContactorIds");
            return (Criteria) this;
        }

        public Criteria andRegiReqIsNull() {
            addCriterion("regi_req is null");
            return (Criteria) this;
        }

        public Criteria andRegiReqIsNotNull() {
            addCriterion("regi_req is not null");
            return (Criteria) this;
        }

        public Criteria andRegiReqEqualTo(String value) {
            addCriterion("regi_req =", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqNotEqualTo(String value) {
            addCriterion("regi_req <>", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqGreaterThan(String value) {
            addCriterion("regi_req >", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqGreaterThanOrEqualTo(String value) {
            addCriterion("regi_req >=", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqLessThan(String value) {
            addCriterion("regi_req <", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqLessThanOrEqualTo(String value) {
            addCriterion("regi_req <=", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqLike(String value) {
            addCriterion("regi_req like", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqNotLike(String value) {
            addCriterion("regi_req not like", value, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqIn(List<String> values) {
            addCriterion("regi_req in", values, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqNotIn(List<String> values) {
            addCriterion("regi_req not in", values, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqBetween(String value1, String value2) {
            addCriterion("regi_req between", value1, value2, "regiReq");
            return (Criteria) this;
        }

        public Criteria andRegiReqNotBetween(String value1, String value2) {
            addCriterion("regi_req not between", value1, value2, "regiReq");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsIsNull() {
            addCriterion("pur_tender_ids is null");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsIsNotNull() {
            addCriterion("pur_tender_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsEqualTo(String value) {
            addCriterion("pur_tender_ids =", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsNotEqualTo(String value) {
            addCriterion("pur_tender_ids <>", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsGreaterThan(String value) {
            addCriterion("pur_tender_ids >", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsGreaterThanOrEqualTo(String value) {
            addCriterion("pur_tender_ids >=", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsLessThan(String value) {
            addCriterion("pur_tender_ids <", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsLessThanOrEqualTo(String value) {
            addCriterion("pur_tender_ids <=", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsLike(String value) {
            addCriterion("pur_tender_ids like", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsNotLike(String value) {
            addCriterion("pur_tender_ids not like", value, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsIn(List<String> values) {
            addCriterion("pur_tender_ids in", values, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsNotIn(List<String> values) {
            addCriterion("pur_tender_ids not in", values, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsBetween(String value1, String value2) {
            addCriterion("pur_tender_ids between", value1, value2, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderIdsNotBetween(String value1, String value2) {
            addCriterion("pur_tender_ids not between", value1, value2, "purTenderIds");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateIsNull() {
            addCriterion("pur_tender_date is null");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateIsNotNull() {
            addCriterion("pur_tender_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateEqualTo(Date value) {
            addCriterion("pur_tender_date =", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateNotEqualTo(Date value) {
            addCriterion("pur_tender_date <>", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateGreaterThan(Date value) {
            addCriterion("pur_tender_date >", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pur_tender_date >=", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateLessThan(Date value) {
            addCriterion("pur_tender_date <", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateLessThanOrEqualTo(Date value) {
            addCriterion("pur_tender_date <=", value, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateIn(List<Date> values) {
            addCriterion("pur_tender_date in", values, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateNotIn(List<Date> values) {
            addCriterion("pur_tender_date not in", values, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateBetween(Date value1, Date value2) {
            addCriterion("pur_tender_date between", value1, value2, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderDateNotBetween(Date value1, Date value2) {
            addCriterion("pur_tender_date not between", value1, value2, "purTenderDate");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostIsNull() {
            addCriterion("pur_tender_cost is null");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostIsNotNull() {
            addCriterion("pur_tender_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostEqualTo(BigDecimal value) {
            addCriterion("pur_tender_cost =", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostNotEqualTo(BigDecimal value) {
            addCriterion("pur_tender_cost <>", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostGreaterThan(BigDecimal value) {
            addCriterion("pur_tender_cost >", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pur_tender_cost >=", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostLessThan(BigDecimal value) {
            addCriterion("pur_tender_cost <", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pur_tender_cost <=", value, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostIn(List<BigDecimal> values) {
            addCriterion("pur_tender_cost in", values, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostNotIn(List<BigDecimal> values) {
            addCriterion("pur_tender_cost not in", values, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pur_tender_cost between", value1, value2, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pur_tender_cost not between", value1, value2, "purTenderCost");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseIsNull() {
            addCriterion("pur_tender_travel_expense is null");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseIsNotNull() {
            addCriterion("pur_tender_travel_expense is not null");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseEqualTo(BigDecimal value) {
            addCriterion("pur_tender_travel_expense =", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseNotEqualTo(BigDecimal value) {
            addCriterion("pur_tender_travel_expense <>", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseGreaterThan(BigDecimal value) {
            addCriterion("pur_tender_travel_expense >", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pur_tender_travel_expense >=", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseLessThan(BigDecimal value) {
            addCriterion("pur_tender_travel_expense <", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pur_tender_travel_expense <=", value, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseIn(List<BigDecimal> values) {
            addCriterion("pur_tender_travel_expense in", values, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseNotIn(List<BigDecimal> values) {
            addCriterion("pur_tender_travel_expense not in", values, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pur_tender_travel_expense between", value1, value2, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andPurTenderTravelExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pur_tender_travel_expense not between", value1, value2, "purTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathIsNull() {
            addCriterion("tender_file_path is null");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathIsNotNull() {
            addCriterion("tender_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathEqualTo(String value) {
            addCriterion("tender_file_path =", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathNotEqualTo(String value) {
            addCriterion("tender_file_path <>", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathGreaterThan(String value) {
            addCriterion("tender_file_path >", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("tender_file_path >=", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathLessThan(String value) {
            addCriterion("tender_file_path <", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathLessThanOrEqualTo(String value) {
            addCriterion("tender_file_path <=", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathLike(String value) {
            addCriterion("tender_file_path like", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathNotLike(String value) {
            addCriterion("tender_file_path not like", value, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathIn(List<String> values) {
            addCriterion("tender_file_path in", values, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathNotIn(List<String> values) {
            addCriterion("tender_file_path not in", values, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathBetween(String value1, String value2) {
            addCriterion("tender_file_path between", value1, value2, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andTenderFilePathNotBetween(String value1, String value2) {
            addCriterion("tender_file_path not between", value1, value2, "tenderFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathIsNull() {
            addCriterion("config_file_path is null");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathIsNotNull() {
            addCriterion("config_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathEqualTo(String value) {
            addCriterion("config_file_path =", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathNotEqualTo(String value) {
            addCriterion("config_file_path <>", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathGreaterThan(String value) {
            addCriterion("config_file_path >", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("config_file_path >=", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathLessThan(String value) {
            addCriterion("config_file_path <", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathLessThanOrEqualTo(String value) {
            addCriterion("config_file_path <=", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathLike(String value) {
            addCriterion("config_file_path like", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathNotLike(String value) {
            addCriterion("config_file_path not like", value, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathIn(List<String> values) {
            addCriterion("config_file_path in", values, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathNotIn(List<String> values) {
            addCriterion("config_file_path not in", values, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathBetween(String value1, String value2) {
            addCriterion("config_file_path between", value1, value2, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andConfigFilePathNotBetween(String value1, String value2) {
            addCriterion("config_file_path not between", value1, value2, "configFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathIsNull() {
            addCriterion("qualification_file_path is null");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathIsNotNull() {
            addCriterion("qualification_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathEqualTo(String value) {
            addCriterion("qualification_file_path =", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathNotEqualTo(String value) {
            addCriterion("qualification_file_path <>", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathGreaterThan(String value) {
            addCriterion("qualification_file_path >", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_file_path >=", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathLessThan(String value) {
            addCriterion("qualification_file_path <", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathLessThanOrEqualTo(String value) {
            addCriterion("qualification_file_path <=", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathLike(String value) {
            addCriterion("qualification_file_path like", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathNotLike(String value) {
            addCriterion("qualification_file_path not like", value, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathIn(List<String> values) {
            addCriterion("qualification_file_path in", values, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathNotIn(List<String> values) {
            addCriterion("qualification_file_path not in", values, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathBetween(String value1, String value2) {
            addCriterion("qualification_file_path between", value1, value2, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andQualificationFilePathNotBetween(String value1, String value2) {
            addCriterion("qualification_file_path not between", value1, value2, "qualificationFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathIsNull() {
            addCriterion("business_technology_assessment_file_path is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathIsNotNull() {
            addCriterion("business_technology_assessment_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathEqualTo(String value) {
            addCriterion("business_technology_assessment_file_path =", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathNotEqualTo(String value) {
            addCriterion("business_technology_assessment_file_path <>", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathGreaterThan(String value) {
            addCriterion("business_technology_assessment_file_path >", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("business_technology_assessment_file_path >=", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathLessThan(String value) {
            addCriterion("business_technology_assessment_file_path <", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathLessThanOrEqualTo(String value) {
            addCriterion("business_technology_assessment_file_path <=", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathLike(String value) {
            addCriterion("business_technology_assessment_file_path like", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathNotLike(String value) {
            addCriterion("business_technology_assessment_file_path not like", value, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathIn(List<String> values) {
            addCriterion("business_technology_assessment_file_path in", values, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathNotIn(List<String> values) {
            addCriterion("business_technology_assessment_file_path not in", values, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathBetween(String value1, String value2) {
            addCriterion("business_technology_assessment_file_path between", value1, value2, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessTechnologyAssessmentFilePathNotBetween(String value1, String value2) {
            addCriterion("business_technology_assessment_file_path not between", value1, value2, "businessTechnologyAssessmentFilePath");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIsNull() {
            addCriterion("survey_place is null");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIsNotNull() {
            addCriterion("survey_place is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceEqualTo(String value) {
            addCriterion("survey_place =", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotEqualTo(String value) {
            addCriterion("survey_place <>", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceGreaterThan(String value) {
            addCriterion("survey_place >", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("survey_place >=", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLessThan(String value) {
            addCriterion("survey_place <", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLessThanOrEqualTo(String value) {
            addCriterion("survey_place <=", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceLike(String value) {
            addCriterion("survey_place like", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotLike(String value) {
            addCriterion("survey_place not like", value, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceIn(List<String> values) {
            addCriterion("survey_place in", values, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotIn(List<String> values) {
            addCriterion("survey_place not in", values, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceBetween(String value1, String value2) {
            addCriterion("survey_place between", value1, value2, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyPlaceNotBetween(String value1, String value2) {
            addCriterion("survey_place not between", value1, value2, "surveyPlace");
            return (Criteria) this;
        }

        public Criteria andSurveyDateIsNull() {
            addCriterion("survey_date is null");
            return (Criteria) this;
        }

        public Criteria andSurveyDateIsNotNull() {
            addCriterion("survey_date is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyDateEqualTo(Date value) {
            addCriterion("survey_date =", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateNotEqualTo(Date value) {
            addCriterion("survey_date <>", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateGreaterThan(Date value) {
            addCriterion("survey_date >", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("survey_date >=", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateLessThan(Date value) {
            addCriterion("survey_date <", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateLessThanOrEqualTo(Date value) {
            addCriterion("survey_date <=", value, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateIn(List<Date> values) {
            addCriterion("survey_date in", values, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateNotIn(List<Date> values) {
            addCriterion("survey_date not in", values, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateBetween(Date value1, Date value2) {
            addCriterion("survey_date between", value1, value2, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyDateNotBetween(Date value1, Date value2) {
            addCriterion("survey_date not between", value1, value2, "surveyDate");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsIsNull() {
            addCriterion("survey_unit_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsIsNotNull() {
            addCriterion("survey_unit_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsEqualTo(String value) {
            addCriterion("survey_unit_contactor_ids =", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsNotEqualTo(String value) {
            addCriterion("survey_unit_contactor_ids <>", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsGreaterThan(String value) {
            addCriterion("survey_unit_contactor_ids >", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("survey_unit_contactor_ids >=", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsLessThan(String value) {
            addCriterion("survey_unit_contactor_ids <", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("survey_unit_contactor_ids <=", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsLike(String value) {
            addCriterion("survey_unit_contactor_ids like", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsNotLike(String value) {
            addCriterion("survey_unit_contactor_ids not like", value, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsIn(List<String> values) {
            addCriterion("survey_unit_contactor_ids in", values, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsNotIn(List<String> values) {
            addCriterion("survey_unit_contactor_ids not in", values, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsBetween(String value1, String value2) {
            addCriterion("survey_unit_contactor_ids between", value1, value2, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitContactorIdsNotBetween(String value1, String value2) {
            addCriterion("survey_unit_contactor_ids not between", value1, value2, "surveyUnitContactorIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsIsNull() {
            addCriterion("survey_unit_leader_ids is null");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsIsNotNull() {
            addCriterion("survey_unit_leader_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsEqualTo(String value) {
            addCriterion("survey_unit_leader_ids =", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsNotEqualTo(String value) {
            addCriterion("survey_unit_leader_ids <>", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsGreaterThan(String value) {
            addCriterion("survey_unit_leader_ids >", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsGreaterThanOrEqualTo(String value) {
            addCriterion("survey_unit_leader_ids >=", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsLessThan(String value) {
            addCriterion("survey_unit_leader_ids <", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsLessThanOrEqualTo(String value) {
            addCriterion("survey_unit_leader_ids <=", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsLike(String value) {
            addCriterion("survey_unit_leader_ids like", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsNotLike(String value) {
            addCriterion("survey_unit_leader_ids not like", value, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsIn(List<String> values) {
            addCriterion("survey_unit_leader_ids in", values, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsNotIn(List<String> values) {
            addCriterion("survey_unit_leader_ids not in", values, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsBetween(String value1, String value2) {
            addCriterion("survey_unit_leader_ids between", value1, value2, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyUnitLeaderIdsNotBetween(String value1, String value2) {
            addCriterion("survey_unit_leader_ids not between", value1, value2, "surveyUnitLeaderIds");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleIsNull() {
            addCriterion("survey_has_sample is null");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleIsNotNull() {
            addCriterion("survey_has_sample is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleEqualTo(Boolean value) {
            addCriterion("survey_has_sample =", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleNotEqualTo(Boolean value) {
            addCriterion("survey_has_sample <>", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleGreaterThan(Boolean value) {
            addCriterion("survey_has_sample >", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("survey_has_sample >=", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleLessThan(Boolean value) {
            addCriterion("survey_has_sample <", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleLessThanOrEqualTo(Boolean value) {
            addCriterion("survey_has_sample <=", value, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleIn(List<Boolean> values) {
            addCriterion("survey_has_sample in", values, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleNotIn(List<Boolean> values) {
            addCriterion("survey_has_sample not in", values, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleBetween(Boolean value1, Boolean value2) {
            addCriterion("survey_has_sample between", value1, value2, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveyHasSampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("survey_has_sample not between", value1, value2, "surveyHasSample");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailIsNull() {
            addCriterion("survey_sample_detail is null");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailIsNotNull() {
            addCriterion("survey_sample_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailEqualTo(String value) {
            addCriterion("survey_sample_detail =", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailNotEqualTo(String value) {
            addCriterion("survey_sample_detail <>", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailGreaterThan(String value) {
            addCriterion("survey_sample_detail >", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailGreaterThanOrEqualTo(String value) {
            addCriterion("survey_sample_detail >=", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailLessThan(String value) {
            addCriterion("survey_sample_detail <", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailLessThanOrEqualTo(String value) {
            addCriterion("survey_sample_detail <=", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailLike(String value) {
            addCriterion("survey_sample_detail like", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailNotLike(String value) {
            addCriterion("survey_sample_detail not like", value, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailIn(List<String> values) {
            addCriterion("survey_sample_detail in", values, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailNotIn(List<String> values) {
            addCriterion("survey_sample_detail not in", values, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailBetween(String value1, String value2) {
            addCriterion("survey_sample_detail between", value1, value2, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveySampleDetailNotBetween(String value1, String value2) {
            addCriterion("survey_sample_detail not between", value1, value2, "surveySampleDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleIsNull() {
            addCriterion("survey_test_sample is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleIsNotNull() {
            addCriterion("survey_test_sample is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleEqualTo(Boolean value) {
            addCriterion("survey_test_sample =", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleNotEqualTo(Boolean value) {
            addCriterion("survey_test_sample <>", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleGreaterThan(Boolean value) {
            addCriterion("survey_test_sample >", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("survey_test_sample >=", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleLessThan(Boolean value) {
            addCriterion("survey_test_sample <", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleLessThanOrEqualTo(Boolean value) {
            addCriterion("survey_test_sample <=", value, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleIn(List<Boolean> values) {
            addCriterion("survey_test_sample in", values, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleNotIn(List<Boolean> values) {
            addCriterion("survey_test_sample not in", values, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleBetween(Boolean value1, Boolean value2) {
            addCriterion("survey_test_sample between", value1, value2, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestSampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("survey_test_sample not between", value1, value2, "surveyTestSample");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailIsNull() {
            addCriterion("survey_test_detail is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailIsNotNull() {
            addCriterion("survey_test_detail is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailEqualTo(String value) {
            addCriterion("survey_test_detail =", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailNotEqualTo(String value) {
            addCriterion("survey_test_detail <>", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailGreaterThan(String value) {
            addCriterion("survey_test_detail >", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailGreaterThanOrEqualTo(String value) {
            addCriterion("survey_test_detail >=", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailLessThan(String value) {
            addCriterion("survey_test_detail <", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailLessThanOrEqualTo(String value) {
            addCriterion("survey_test_detail <=", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailLike(String value) {
            addCriterion("survey_test_detail like", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailNotLike(String value) {
            addCriterion("survey_test_detail not like", value, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailIn(List<String> values) {
            addCriterion("survey_test_detail in", values, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailNotIn(List<String> values) {
            addCriterion("survey_test_detail not in", values, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailBetween(String value1, String value2) {
            addCriterion("survey_test_detail between", value1, value2, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTestDetailNotBetween(String value1, String value2) {
            addCriterion("survey_test_detail not between", value1, value2, "surveyTestDetail");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseIsNull() {
            addCriterion("survey_travel_expense is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseIsNotNull() {
            addCriterion("survey_travel_expense is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseEqualTo(BigDecimal value) {
            addCriterion("survey_travel_expense =", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseNotEqualTo(BigDecimal value) {
            addCriterion("survey_travel_expense <>", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseGreaterThan(BigDecimal value) {
            addCriterion("survey_travel_expense >", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("survey_travel_expense >=", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseLessThan(BigDecimal value) {
            addCriterion("survey_travel_expense <", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("survey_travel_expense <=", value, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseIn(List<BigDecimal> values) {
            addCriterion("survey_travel_expense in", values, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseNotIn(List<BigDecimal> values) {
            addCriterion("survey_travel_expense not in", values, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("survey_travel_expense between", value1, value2, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveyTravelExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("survey_travel_expense not between", value1, value2, "surveyTravelExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseIsNull() {
            addCriterion("survey_sample_transfor_expense is null");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseIsNotNull() {
            addCriterion("survey_sample_transfor_expense is not null");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseEqualTo(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense =", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseNotEqualTo(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense <>", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseGreaterThan(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense >", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense >=", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseLessThan(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense <", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("survey_sample_transfor_expense <=", value, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseIn(List<BigDecimal> values) {
            addCriterion("survey_sample_transfor_expense in", values, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseNotIn(List<BigDecimal> values) {
            addCriterion("survey_sample_transfor_expense not in", values, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("survey_sample_transfor_expense between", value1, value2, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andSurveySampleTransforExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("survey_sample_transfor_expense not between", value1, value2, "surveySampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsIsNull() {
            addCriterion("tender_price_file_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsIsNotNull() {
            addCriterion("tender_price_file_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsEqualTo(String value) {
            addCriterion("tender_price_file_contactor_ids =", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsNotEqualTo(String value) {
            addCriterion("tender_price_file_contactor_ids <>", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsGreaterThan(String value) {
            addCriterion("tender_price_file_contactor_ids >", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("tender_price_file_contactor_ids >=", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsLessThan(String value) {
            addCriterion("tender_price_file_contactor_ids <", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("tender_price_file_contactor_ids <=", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsLike(String value) {
            addCriterion("tender_price_file_contactor_ids like", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsNotLike(String value) {
            addCriterion("tender_price_file_contactor_ids not like", value, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsIn(List<String> values) {
            addCriterion("tender_price_file_contactor_ids in", values, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsNotIn(List<String> values) {
            addCriterion("tender_price_file_contactor_ids not in", values, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsBetween(String value1, String value2) {
            addCriterion("tender_price_file_contactor_ids between", value1, value2, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderPriceFileContactorIdsNotBetween(String value1, String value2) {
            addCriterion("tender_price_file_contactor_ids not between", value1, value2, "tenderPriceFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsIsNull() {
            addCriterion("tender_book_file_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsIsNotNull() {
            addCriterion("tender_book_file_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsEqualTo(String value) {
            addCriterion("tender_book_file_contactor_ids =", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsNotEqualTo(String value) {
            addCriterion("tender_book_file_contactor_ids <>", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsGreaterThan(String value) {
            addCriterion("tender_book_file_contactor_ids >", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("tender_book_file_contactor_ids >=", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsLessThan(String value) {
            addCriterion("tender_book_file_contactor_ids <", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("tender_book_file_contactor_ids <=", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsLike(String value) {
            addCriterion("tender_book_file_contactor_ids like", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsNotLike(String value) {
            addCriterion("tender_book_file_contactor_ids not like", value, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsIn(List<String> values) {
            addCriterion("tender_book_file_contactor_ids in", values, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsNotIn(List<String> values) {
            addCriterion("tender_book_file_contactor_ids not in", values, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsBetween(String value1, String value2) {
            addCriterion("tender_book_file_contactor_ids between", value1, value2, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andTenderBookFileContactorIdsNotBetween(String value1, String value2) {
            addCriterion("tender_book_file_contactor_ids not between", value1, value2, "tenderBookFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsIsNull() {
            addCriterion("prove_file_contactor_ids is null");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsIsNotNull() {
            addCriterion("prove_file_contactor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsEqualTo(String value) {
            addCriterion("prove_file_contactor_ids =", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsNotEqualTo(String value) {
            addCriterion("prove_file_contactor_ids <>", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsGreaterThan(String value) {
            addCriterion("prove_file_contactor_ids >", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("prove_file_contactor_ids >=", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsLessThan(String value) {
            addCriterion("prove_file_contactor_ids <", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsLessThanOrEqualTo(String value) {
            addCriterion("prove_file_contactor_ids <=", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsLike(String value) {
            addCriterion("prove_file_contactor_ids like", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsNotLike(String value) {
            addCriterion("prove_file_contactor_ids not like", value, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsIn(List<String> values) {
            addCriterion("prove_file_contactor_ids in", values, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsNotIn(List<String> values) {
            addCriterion("prove_file_contactor_ids not in", values, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsBetween(String value1, String value2) {
            addCriterion("prove_file_contactor_ids between", value1, value2, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andProveFileContactorIdsNotBetween(String value1, String value2) {
            addCriterion("prove_file_contactor_ids not between", value1, value2, "proveFileContactorIds");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostIsNull() {
            addCriterion("print_tender_cost is null");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostIsNotNull() {
            addCriterion("print_tender_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostEqualTo(BigDecimal value) {
            addCriterion("print_tender_cost =", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostNotEqualTo(BigDecimal value) {
            addCriterion("print_tender_cost <>", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostGreaterThan(BigDecimal value) {
            addCriterion("print_tender_cost >", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("print_tender_cost >=", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostLessThan(BigDecimal value) {
            addCriterion("print_tender_cost <", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("print_tender_cost <=", value, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostIn(List<BigDecimal> values) {
            addCriterion("print_tender_cost in", values, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostNotIn(List<BigDecimal> values) {
            addCriterion("print_tender_cost not in", values, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("print_tender_cost between", value1, value2, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andPrintTenderCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("print_tender_cost not between", value1, value2, "printTenderCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostIsNull() {
            addCriterion("tender_car_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostIsNotNull() {
            addCriterion("tender_car_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostEqualTo(BigDecimal value) {
            addCriterion("tender_car_cost =", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_car_cost <>", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostGreaterThan(BigDecimal value) {
            addCriterion("tender_car_cost >", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_car_cost >=", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostLessThan(BigDecimal value) {
            addCriterion("tender_car_cost <", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_car_cost <=", value, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostIn(List<BigDecimal> values) {
            addCriterion("tender_car_cost in", values, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_car_cost not in", values, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_car_cost between", value1, value2, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andTenderCarCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_car_cost not between", value1, value2, "tenderCarCost");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathIsNull() {
            addCriterion("submit_tender_file_path is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathIsNotNull() {
            addCriterion("submit_tender_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathEqualTo(String value) {
            addCriterion("submit_tender_file_path =", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathNotEqualTo(String value) {
            addCriterion("submit_tender_file_path <>", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathGreaterThan(String value) {
            addCriterion("submit_tender_file_path >", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("submit_tender_file_path >=", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathLessThan(String value) {
            addCriterion("submit_tender_file_path <", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathLessThanOrEqualTo(String value) {
            addCriterion("submit_tender_file_path <=", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathLike(String value) {
            addCriterion("submit_tender_file_path like", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathNotLike(String value) {
            addCriterion("submit_tender_file_path not like", value, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathIn(List<String> values) {
            addCriterion("submit_tender_file_path in", values, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathNotIn(List<String> values) {
            addCriterion("submit_tender_file_path not in", values, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathBetween(String value1, String value2) {
            addCriterion("submit_tender_file_path between", value1, value2, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andSubmitTenderFilePathNotBetween(String value1, String value2) {
            addCriterion("submit_tender_file_path not between", value1, value2, "submitTenderFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathIsNull() {
            addCriterion("prove_file_path is null");
            return (Criteria) this;
        }

        public Criteria andProveFilePathIsNotNull() {
            addCriterion("prove_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andProveFilePathEqualTo(String value) {
            addCriterion("prove_file_path =", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathNotEqualTo(String value) {
            addCriterion("prove_file_path <>", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathGreaterThan(String value) {
            addCriterion("prove_file_path >", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("prove_file_path >=", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathLessThan(String value) {
            addCriterion("prove_file_path <", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathLessThanOrEqualTo(String value) {
            addCriterion("prove_file_path <=", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathLike(String value) {
            addCriterion("prove_file_path like", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathNotLike(String value) {
            addCriterion("prove_file_path not like", value, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathIn(List<String> values) {
            addCriterion("prove_file_path in", values, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathNotIn(List<String> values) {
            addCriterion("prove_file_path not in", values, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathBetween(String value1, String value2) {
            addCriterion("prove_file_path between", value1, value2, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andProveFilePathNotBetween(String value1, String value2) {
            addCriterion("prove_file_path not between", value1, value2, "proveFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathIsNull() {
            addCriterion("price_file_path is null");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathIsNotNull() {
            addCriterion("price_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathEqualTo(String value) {
            addCriterion("price_file_path =", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathNotEqualTo(String value) {
            addCriterion("price_file_path <>", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathGreaterThan(String value) {
            addCriterion("price_file_path >", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("price_file_path >=", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathLessThan(String value) {
            addCriterion("price_file_path <", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathLessThanOrEqualTo(String value) {
            addCriterion("price_file_path <=", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathLike(String value) {
            addCriterion("price_file_path like", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathNotLike(String value) {
            addCriterion("price_file_path not like", value, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathIn(List<String> values) {
            addCriterion("price_file_path in", values, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathNotIn(List<String> values) {
            addCriterion("price_file_path not in", values, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathBetween(String value1, String value2) {
            addCriterion("price_file_path between", value1, value2, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andPriceFilePathNotBetween(String value1, String value2) {
            addCriterion("price_file_path not between", value1, value2, "priceFilePath");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceIsNull() {
            addCriterion("start_tender_place is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceIsNotNull() {
            addCriterion("start_tender_place is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceEqualTo(String value) {
            addCriterion("start_tender_place =", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceNotEqualTo(String value) {
            addCriterion("start_tender_place <>", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceGreaterThan(String value) {
            addCriterion("start_tender_place >", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("start_tender_place >=", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceLessThan(String value) {
            addCriterion("start_tender_place <", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceLessThanOrEqualTo(String value) {
            addCriterion("start_tender_place <=", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceLike(String value) {
            addCriterion("start_tender_place like", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceNotLike(String value) {
            addCriterion("start_tender_place not like", value, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceIn(List<String> values) {
            addCriterion("start_tender_place in", values, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceNotIn(List<String> values) {
            addCriterion("start_tender_place not in", values, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceBetween(String value1, String value2) {
            addCriterion("start_tender_place between", value1, value2, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderPlaceNotBetween(String value1, String value2) {
            addCriterion("start_tender_place not between", value1, value2, "startTenderPlace");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeIsNull() {
            addCriterion("start_tender_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeIsNotNull() {
            addCriterion("start_tender_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeEqualTo(Date value) {
            addCriterion("start_tender_time =", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeNotEqualTo(Date value) {
            addCriterion("start_tender_time <>", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeGreaterThan(Date value) {
            addCriterion("start_tender_time >", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_tender_time >=", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeLessThan(Date value) {
            addCriterion("start_tender_time <", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_tender_time <=", value, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeIn(List<Date> values) {
            addCriterion("start_tender_time in", values, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeNotIn(List<Date> values) {
            addCriterion("start_tender_time not in", values, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeBetween(Date value1, Date value2) {
            addCriterion("start_tender_time between", value1, value2, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_tender_time not between", value1, value2, "startTenderTime");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleIsNull() {
            addCriterion("start_tender_has_sample is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleIsNotNull() {
            addCriterion("start_tender_has_sample is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleEqualTo(Boolean value) {
            addCriterion("start_tender_has_sample =", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleNotEqualTo(Boolean value) {
            addCriterion("start_tender_has_sample <>", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleGreaterThan(Boolean value) {
            addCriterion("start_tender_has_sample >", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("start_tender_has_sample >=", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleLessThan(Boolean value) {
            addCriterion("start_tender_has_sample <", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleLessThanOrEqualTo(Boolean value) {
            addCriterion("start_tender_has_sample <=", value, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleIn(List<Boolean> values) {
            addCriterion("start_tender_has_sample in", values, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleNotIn(List<Boolean> values) {
            addCriterion("start_tender_has_sample not in", values, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleBetween(Boolean value1, Boolean value2) {
            addCriterion("start_tender_has_sample between", value1, value2, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderHasSampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("start_tender_has_sample not between", value1, value2, "startTenderHasSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailIsNull() {
            addCriterion("start_tender_sample_detail is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailIsNotNull() {
            addCriterion("start_tender_sample_detail is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailEqualTo(String value) {
            addCriterion("start_tender_sample_detail =", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailNotEqualTo(String value) {
            addCriterion("start_tender_sample_detail <>", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailGreaterThan(String value) {
            addCriterion("start_tender_sample_detail >", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailGreaterThanOrEqualTo(String value) {
            addCriterion("start_tender_sample_detail >=", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailLessThan(String value) {
            addCriterion("start_tender_sample_detail <", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailLessThanOrEqualTo(String value) {
            addCriterion("start_tender_sample_detail <=", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailLike(String value) {
            addCriterion("start_tender_sample_detail like", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailNotLike(String value) {
            addCriterion("start_tender_sample_detail not like", value, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailIn(List<String> values) {
            addCriterion("start_tender_sample_detail in", values, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailNotIn(List<String> values) {
            addCriterion("start_tender_sample_detail not in", values, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailBetween(String value1, String value2) {
            addCriterion("start_tender_sample_detail between", value1, value2, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleDetailNotBetween(String value1, String value2) {
            addCriterion("start_tender_sample_detail not between", value1, value2, "startTenderSampleDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleIsNull() {
            addCriterion("start_tender_test_sample is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleIsNotNull() {
            addCriterion("start_tender_test_sample is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleEqualTo(Boolean value) {
            addCriterion("start_tender_test_sample =", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleNotEqualTo(Boolean value) {
            addCriterion("start_tender_test_sample <>", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleGreaterThan(Boolean value) {
            addCriterion("start_tender_test_sample >", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("start_tender_test_sample >=", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleLessThan(Boolean value) {
            addCriterion("start_tender_test_sample <", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleLessThanOrEqualTo(Boolean value) {
            addCriterion("start_tender_test_sample <=", value, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleIn(List<Boolean> values) {
            addCriterion("start_tender_test_sample in", values, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleNotIn(List<Boolean> values) {
            addCriterion("start_tender_test_sample not in", values, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleBetween(Boolean value1, Boolean value2) {
            addCriterion("start_tender_test_sample between", value1, value2, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestSampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("start_tender_test_sample not between", value1, value2, "startTenderTestSample");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailIsNull() {
            addCriterion("start_tender_test_detail is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailIsNotNull() {
            addCriterion("start_tender_test_detail is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailEqualTo(String value) {
            addCriterion("start_tender_test_detail =", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailNotEqualTo(String value) {
            addCriterion("start_tender_test_detail <>", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailGreaterThan(String value) {
            addCriterion("start_tender_test_detail >", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailGreaterThanOrEqualTo(String value) {
            addCriterion("start_tender_test_detail >=", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailLessThan(String value) {
            addCriterion("start_tender_test_detail <", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailLessThanOrEqualTo(String value) {
            addCriterion("start_tender_test_detail <=", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailLike(String value) {
            addCriterion("start_tender_test_detail like", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailNotLike(String value) {
            addCriterion("start_tender_test_detail not like", value, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailIn(List<String> values) {
            addCriterion("start_tender_test_detail in", values, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailNotIn(List<String> values) {
            addCriterion("start_tender_test_detail not in", values, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailBetween(String value1, String value2) {
            addCriterion("start_tender_test_detail between", value1, value2, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderTestDetailNotBetween(String value1, String value2) {
            addCriterion("start_tender_test_detail not between", value1, value2, "startTenderTestDetail");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsIsNull() {
            addCriterion("start_tender_leader_ids is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsIsNotNull() {
            addCriterion("start_tender_leader_ids is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsEqualTo(String value) {
            addCriterion("start_tender_leader_ids =", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsNotEqualTo(String value) {
            addCriterion("start_tender_leader_ids <>", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsGreaterThan(String value) {
            addCriterion("start_tender_leader_ids >", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsGreaterThanOrEqualTo(String value) {
            addCriterion("start_tender_leader_ids >=", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsLessThan(String value) {
            addCriterion("start_tender_leader_ids <", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsLessThanOrEqualTo(String value) {
            addCriterion("start_tender_leader_ids <=", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsLike(String value) {
            addCriterion("start_tender_leader_ids like", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsNotLike(String value) {
            addCriterion("start_tender_leader_ids not like", value, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsIn(List<String> values) {
            addCriterion("start_tender_leader_ids in", values, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsNotIn(List<String> values) {
            addCriterion("start_tender_leader_ids not in", values, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsBetween(String value1, String value2) {
            addCriterion("start_tender_leader_ids between", value1, value2, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderLeaderIdsNotBetween(String value1, String value2) {
            addCriterion("start_tender_leader_ids not between", value1, value2, "startTenderLeaderIds");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseIsNull() {
            addCriterion("start_tender_travel_expense is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseIsNotNull() {
            addCriterion("start_tender_travel_expense is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseEqualTo(BigDecimal value) {
            addCriterion("start_tender_travel_expense =", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseNotEqualTo(BigDecimal value) {
            addCriterion("start_tender_travel_expense <>", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseGreaterThan(BigDecimal value) {
            addCriterion("start_tender_travel_expense >", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_travel_expense >=", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseLessThan(BigDecimal value) {
            addCriterion("start_tender_travel_expense <", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_travel_expense <=", value, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseIn(List<BigDecimal> values) {
            addCriterion("start_tender_travel_expense in", values, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseNotIn(List<BigDecimal> values) {
            addCriterion("start_tender_travel_expense not in", values, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_travel_expense between", value1, value2, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTravelExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_travel_expense not between", value1, value2, "startTenderTravelExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseIsNull() {
            addCriterion("start_tender_sample_transfor_expense is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseIsNotNull() {
            addCriterion("start_tender_sample_transfor_expense is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseEqualTo(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense =", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseNotEqualTo(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense <>", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseGreaterThan(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense >", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense >=", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseLessThan(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense <", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_sample_transfor_expense <=", value, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseIn(List<BigDecimal> values) {
            addCriterion("start_tender_sample_transfor_expense in", values, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseNotIn(List<BigDecimal> values) {
            addCriterion("start_tender_sample_transfor_expense not in", values, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_sample_transfor_expense between", value1, value2, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderSampleTransforExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_sample_transfor_expense not between", value1, value2, "startTenderSampleTransforExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseIsNull() {
            addCriterion("start_tender_total_expense is null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseIsNotNull() {
            addCriterion("start_tender_total_expense is not null");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseEqualTo(BigDecimal value) {
            addCriterion("start_tender_total_expense =", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseNotEqualTo(BigDecimal value) {
            addCriterion("start_tender_total_expense <>", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseGreaterThan(BigDecimal value) {
            addCriterion("start_tender_total_expense >", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_total_expense >=", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseLessThan(BigDecimal value) {
            addCriterion("start_tender_total_expense <", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_tender_total_expense <=", value, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseIn(List<BigDecimal> values) {
            addCriterion("start_tender_total_expense in", values, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseNotIn(List<BigDecimal> values) {
            addCriterion("start_tender_total_expense not in", values, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_total_expense between", value1, value2, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andStartTenderTotalExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_tender_total_expense not between", value1, value2, "startTenderTotalExpense");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameIsNull() {
            addCriterion("tender_people_name is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameIsNotNull() {
            addCriterion("tender_people_name is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameEqualTo(String value) {
            addCriterion("tender_people_name =", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameNotEqualTo(String value) {
            addCriterion("tender_people_name <>", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameGreaterThan(String value) {
            addCriterion("tender_people_name >", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("tender_people_name >=", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameLessThan(String value) {
            addCriterion("tender_people_name <", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameLessThanOrEqualTo(String value) {
            addCriterion("tender_people_name <=", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameLike(String value) {
            addCriterion("tender_people_name like", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameNotLike(String value) {
            addCriterion("tender_people_name not like", value, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameIn(List<String> values) {
            addCriterion("tender_people_name in", values, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameNotIn(List<String> values) {
            addCriterion("tender_people_name not in", values, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameBetween(String value1, String value2) {
            addCriterion("tender_people_name between", value1, value2, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleNameNotBetween(String value1, String value2) {
            addCriterion("tender_people_name not between", value1, value2, "tenderPeopleName");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneIsNull() {
            addCriterion("tender_people_phone is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneIsNotNull() {
            addCriterion("tender_people_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneEqualTo(String value) {
            addCriterion("tender_people_phone =", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneNotEqualTo(String value) {
            addCriterion("tender_people_phone <>", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneGreaterThan(String value) {
            addCriterion("tender_people_phone >", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tender_people_phone >=", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneLessThan(String value) {
            addCriterion("tender_people_phone <", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneLessThanOrEqualTo(String value) {
            addCriterion("tender_people_phone <=", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneLike(String value) {
            addCriterion("tender_people_phone like", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneNotLike(String value) {
            addCriterion("tender_people_phone not like", value, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneIn(List<String> values) {
            addCriterion("tender_people_phone in", values, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneNotIn(List<String> values) {
            addCriterion("tender_people_phone not in", values, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneBetween(String value1, String value2) {
            addCriterion("tender_people_phone between", value1, value2, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeoplePhoneNotBetween(String value1, String value2) {
            addCriterion("tender_people_phone not between", value1, value2, "tenderPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostIsNull() {
            addCriterion("tender_people_train_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostIsNotNull() {
            addCriterion("tender_people_train_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_train_cost =", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_train_cost <>", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_train_cost >", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_train_cost >=", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostLessThan(BigDecimal value) {
            addCriterion("tender_people_train_cost <", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_train_cost <=", value, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_train_cost in", values, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_train_cost not in", values, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_train_cost between", value1, value2, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTrainCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_train_cost not between", value1, value2, "tenderPeopleTrainCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostIsNull() {
            addCriterion("tender_people_flight_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostIsNotNull() {
            addCriterion("tender_people_flight_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_flight_cost =", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_flight_cost <>", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_flight_cost >", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_flight_cost >=", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostLessThan(BigDecimal value) {
            addCriterion("tender_people_flight_cost <", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_flight_cost <=", value, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_flight_cost in", values, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_flight_cost not in", values, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_flight_cost between", value1, value2, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFlightCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_flight_cost not between", value1, value2, "tenderPeopleFlightCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostIsNull() {
            addCriterion("tender_people_stay_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostIsNotNull() {
            addCriterion("tender_people_stay_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_stay_cost =", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_stay_cost <>", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_stay_cost >", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_stay_cost >=", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostLessThan(BigDecimal value) {
            addCriterion("tender_people_stay_cost <", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_stay_cost <=", value, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_stay_cost in", values, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_stay_cost not in", values, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_stay_cost between", value1, value2, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleStayCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_stay_cost not between", value1, value2, "tenderPeopleStayCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostIsNull() {
            addCriterion("tender_people_supply_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostIsNotNull() {
            addCriterion("tender_people_supply_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_supply_cost =", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_supply_cost <>", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_supply_cost >", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_supply_cost >=", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostLessThan(BigDecimal value) {
            addCriterion("tender_people_supply_cost <", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_supply_cost <=", value, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_supply_cost in", values, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_supply_cost not in", values, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_supply_cost between", value1, value2, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleSupplyCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_supply_cost not between", value1, value2, "tenderPeopleSupplyCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostIsNull() {
            addCriterion("tender_people_taxi_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostIsNotNull() {
            addCriterion("tender_people_taxi_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_taxi_cost =", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_taxi_cost <>", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_taxi_cost >", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_taxi_cost >=", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostLessThan(BigDecimal value) {
            addCriterion("tender_people_taxi_cost <", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_taxi_cost <=", value, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_taxi_cost in", values, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_taxi_cost not in", values, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_taxi_cost between", value1, value2, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTaxiCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_taxi_cost not between", value1, value2, "tenderPeopleTaxiCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostIsNull() {
            addCriterion("tender_people_other_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostIsNotNull() {
            addCriterion("tender_people_other_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_other_cost =", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_other_cost <>", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_other_cost >", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_other_cost >=", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostLessThan(BigDecimal value) {
            addCriterion("tender_people_other_cost <", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_other_cost <=", value, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_other_cost in", values, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_other_cost not in", values, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_other_cost between", value1, value2, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleOtherCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_other_cost not between", value1, value2, "tenderPeopleOtherCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostIsNull() {
            addCriterion("tender_people_file_transfor_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostIsNotNull() {
            addCriterion("tender_people_file_transfor_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost =", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost <>", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost >", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost >=", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostLessThan(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost <", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_file_transfor_cost <=", value, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_file_transfor_cost in", values, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_file_transfor_cost not in", values, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_file_transfor_cost between", value1, value2, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleFileTransforCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_file_transfor_cost not between", value1, value2, "tenderPeopleFileTransforCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostIsNull() {
            addCriterion("tender_people_total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostIsNotNull() {
            addCriterion("tender_people_total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostEqualTo(BigDecimal value) {
            addCriterion("tender_people_total_cost =", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_people_total_cost <>", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostGreaterThan(BigDecimal value) {
            addCriterion("tender_people_total_cost >", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_total_cost >=", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostLessThan(BigDecimal value) {
            addCriterion("tender_people_total_cost <", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_people_total_cost <=", value, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostIn(List<BigDecimal> values) {
            addCriterion("tender_people_total_cost in", values, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_people_total_cost not in", values, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_total_cost between", value1, value2, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPeopleTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_people_total_cost not between", value1, value2, "tenderPeopleTotalCost");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceIsNull() {
            addCriterion("tender_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceIsNotNull() {
            addCriterion("tender_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceEqualTo(BigDecimal value) {
            addCriterion("tender_pay_price =", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("tender_pay_price <>", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceGreaterThan(BigDecimal value) {
            addCriterion("tender_pay_price >", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_pay_price >=", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceLessThan(BigDecimal value) {
            addCriterion("tender_pay_price <", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_pay_price <=", value, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceIn(List<BigDecimal> values) {
            addCriterion("tender_pay_price in", values, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("tender_pay_price not in", values, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_pay_price between", value1, value2, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_pay_price not between", value1, value2, "tenderPayPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinIsNull() {
            addCriterion("tender_win is null");
            return (Criteria) this;
        }

        public Criteria andTenderWinIsNotNull() {
            addCriterion("tender_win is not null");
            return (Criteria) this;
        }

        public Criteria andTenderWinEqualTo(Boolean value) {
            addCriterion("tender_win =", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinNotEqualTo(Boolean value) {
            addCriterion("tender_win <>", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinGreaterThan(Boolean value) {
            addCriterion("tender_win >", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tender_win >=", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinLessThan(Boolean value) {
            addCriterion("tender_win <", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinLessThanOrEqualTo(Boolean value) {
            addCriterion("tender_win <=", value, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinIn(List<Boolean> values) {
            addCriterion("tender_win in", values, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinNotIn(List<Boolean> values) {
            addCriterion("tender_win not in", values, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinBetween(Boolean value1, Boolean value2) {
            addCriterion("tender_win between", value1, value2, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tender_win not between", value1, value2, "tenderWin");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceIsNull() {
            addCriterion("tender_win_price is null");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceIsNotNull() {
            addCriterion("tender_win_price is not null");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceEqualTo(BigDecimal value) {
            addCriterion("tender_win_price =", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceNotEqualTo(BigDecimal value) {
            addCriterion("tender_win_price <>", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceGreaterThan(BigDecimal value) {
            addCriterion("tender_win_price >", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_win_price >=", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceLessThan(BigDecimal value) {
            addCriterion("tender_win_price <", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_win_price <=", value, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceIn(List<BigDecimal> values) {
            addCriterion("tender_win_price in", values, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceNotIn(List<BigDecimal> values) {
            addCriterion("tender_win_price not in", values, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_win_price between", value1, value2, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_win_price not between", value1, value2, "tenderWinPrice");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateIsNull() {
            addCriterion("tender_service_rate is null");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateIsNotNull() {
            addCriterion("tender_service_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateEqualTo(String value) {
            addCriterion("tender_service_rate =", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateNotEqualTo(String value) {
            addCriterion("tender_service_rate <>", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateGreaterThan(String value) {
            addCriterion("tender_service_rate >", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateGreaterThanOrEqualTo(String value) {
            addCriterion("tender_service_rate >=", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateLessThan(String value) {
            addCriterion("tender_service_rate <", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateLessThanOrEqualTo(String value) {
            addCriterion("tender_service_rate <=", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateLike(String value) {
            addCriterion("tender_service_rate like", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateNotLike(String value) {
            addCriterion("tender_service_rate not like", value, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateIn(List<String> values) {
            addCriterion("tender_service_rate in", values, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateNotIn(List<String> values) {
            addCriterion("tender_service_rate not in", values, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateBetween(String value1, String value2) {
            addCriterion("tender_service_rate between", value1, value2, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderServiceRateNotBetween(String value1, String value2) {
            addCriterion("tender_service_rate not between", value1, value2, "tenderServiceRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastIsNull() {
            addCriterion("tender_interest_rate_last is null");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastIsNotNull() {
            addCriterion("tender_interest_rate_last is not null");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastEqualTo(String value) {
            addCriterion("tender_interest_rate_last =", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastNotEqualTo(String value) {
            addCriterion("tender_interest_rate_last <>", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastGreaterThan(String value) {
            addCriterion("tender_interest_rate_last >", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastGreaterThanOrEqualTo(String value) {
            addCriterion("tender_interest_rate_last >=", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastLessThan(String value) {
            addCriterion("tender_interest_rate_last <", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastLessThanOrEqualTo(String value) {
            addCriterion("tender_interest_rate_last <=", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastLike(String value) {
            addCriterion("tender_interest_rate_last like", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastNotLike(String value) {
            addCriterion("tender_interest_rate_last not like", value, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastIn(List<String> values) {
            addCriterion("tender_interest_rate_last in", values, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastNotIn(List<String> values) {
            addCriterion("tender_interest_rate_last not in", values, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastBetween(String value1, String value2) {
            addCriterion("tender_interest_rate_last between", value1, value2, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLastNotBetween(String value1, String value2) {
            addCriterion("tender_interest_rate_last not between", value1, value2, "tenderInterestRateLast");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateIsNull() {
            addCriterion("tender_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateIsNotNull() {
            addCriterion("tender_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateEqualTo(String value) {
            addCriterion("tender_interest_rate =", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateNotEqualTo(String value) {
            addCriterion("tender_interest_rate <>", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateGreaterThan(String value) {
            addCriterion("tender_interest_rate >", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateGreaterThanOrEqualTo(String value) {
            addCriterion("tender_interest_rate >=", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLessThan(String value) {
            addCriterion("tender_interest_rate <", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLessThanOrEqualTo(String value) {
            addCriterion("tender_interest_rate <=", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateLike(String value) {
            addCriterion("tender_interest_rate like", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateNotLike(String value) {
            addCriterion("tender_interest_rate not like", value, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateIn(List<String> values) {
            addCriterion("tender_interest_rate in", values, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateNotIn(List<String> values) {
            addCriterion("tender_interest_rate not in", values, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateBetween(String value1, String value2) {
            addCriterion("tender_interest_rate between", value1, value2, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderInterestRateNotBetween(String value1, String value2) {
            addCriterion("tender_interest_rate not between", value1, value2, "tenderInterestRate");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostIsNull() {
            addCriterion("tender_project_integrate_cost is null");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostIsNotNull() {
            addCriterion("tender_project_integrate_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostEqualTo(BigDecimal value) {
            addCriterion("tender_project_integrate_cost =", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostNotEqualTo(BigDecimal value) {
            addCriterion("tender_project_integrate_cost <>", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostGreaterThan(BigDecimal value) {
            addCriterion("tender_project_integrate_cost >", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_project_integrate_cost >=", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostLessThan(BigDecimal value) {
            addCriterion("tender_project_integrate_cost <", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_project_integrate_cost <=", value, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostIn(List<BigDecimal> values) {
            addCriterion("tender_project_integrate_cost in", values, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostNotIn(List<BigDecimal> values) {
            addCriterion("tender_project_integrate_cost not in", values, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_project_integrate_cost between", value1, value2, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andTenderProjectIntegrateCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_project_integrate_cost not between", value1, value2, "tenderProjectIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andIncomingRateIsNull() {
            addCriterion("incoming_rate is null");
            return (Criteria) this;
        }

        public Criteria andIncomingRateIsNotNull() {
            addCriterion("incoming_rate is not null");
            return (Criteria) this;
        }

        public Criteria andIncomingRateEqualTo(String value) {
            addCriterion("incoming_rate =", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateNotEqualTo(String value) {
            addCriterion("incoming_rate <>", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateGreaterThan(String value) {
            addCriterion("incoming_rate >", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateGreaterThanOrEqualTo(String value) {
            addCriterion("incoming_rate >=", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateLessThan(String value) {
            addCriterion("incoming_rate <", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateLessThanOrEqualTo(String value) {
            addCriterion("incoming_rate <=", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateLike(String value) {
            addCriterion("incoming_rate like", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateNotLike(String value) {
            addCriterion("incoming_rate not like", value, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateIn(List<String> values) {
            addCriterion("incoming_rate in", values, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateNotIn(List<String> values) {
            addCriterion("incoming_rate not in", values, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateBetween(String value1, String value2) {
            addCriterion("incoming_rate between", value1, value2, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingRateNotBetween(String value1, String value2) {
            addCriterion("incoming_rate not between", value1, value2, "incomingRate");
            return (Criteria) this;
        }

        public Criteria andIncomingCostIsNull() {
            addCriterion("incoming_cost is null");
            return (Criteria) this;
        }

        public Criteria andIncomingCostIsNotNull() {
            addCriterion("incoming_cost is not null");
            return (Criteria) this;
        }

        public Criteria andIncomingCostEqualTo(BigDecimal value) {
            addCriterion("incoming_cost =", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostNotEqualTo(BigDecimal value) {
            addCriterion("incoming_cost <>", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostGreaterThan(BigDecimal value) {
            addCriterion("incoming_cost >", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("incoming_cost >=", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostLessThan(BigDecimal value) {
            addCriterion("incoming_cost <", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("incoming_cost <=", value, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostIn(List<BigDecimal> values) {
            addCriterion("incoming_cost in", values, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostNotIn(List<BigDecimal> values) {
            addCriterion("incoming_cost not in", values, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incoming_cost between", value1, value2, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andIncomingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incoming_cost not between", value1, value2, "incomingCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostIsNull() {
            addCriterion("project_integrate_total_cost is null");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostIsNotNull() {
            addCriterion("project_integrate_total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostEqualTo(BigDecimal value) {
            addCriterion("project_integrate_total_cost =", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("project_integrate_total_cost <>", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostGreaterThan(BigDecimal value) {
            addCriterion("project_integrate_total_cost >", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_integrate_total_cost >=", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostLessThan(BigDecimal value) {
            addCriterion("project_integrate_total_cost <", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_integrate_total_cost <=", value, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostIn(List<BigDecimal> values) {
            addCriterion("project_integrate_total_cost in", values, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("project_integrate_total_cost not in", values, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_integrate_total_cost between", value1, value2, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andProjectIntegrateTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_integrate_total_cost not between", value1, value2, "projectIntegrateTotalCost");
            return (Criteria) this;
        }

        public Criteria andUnitInterestIsNull() {
            addCriterion("unit_interest is null");
            return (Criteria) this;
        }

        public Criteria andUnitInterestIsNotNull() {
            addCriterion("unit_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUnitInterestEqualTo(BigDecimal value) {
            addCriterion("unit_interest =", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestNotEqualTo(BigDecimal value) {
            addCriterion("unit_interest <>", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestGreaterThan(BigDecimal value) {
            addCriterion("unit_interest >", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_interest >=", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestLessThan(BigDecimal value) {
            addCriterion("unit_interest <", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_interest <=", value, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestIn(List<BigDecimal> values) {
            addCriterion("unit_interest in", values, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestNotIn(List<BigDecimal> values) {
            addCriterion("unit_interest not in", values, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_interest between", value1, value2, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andUnitInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_interest not between", value1, value2, "unitInterest");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostIsNull() {
            addCriterion("cor_integrate_cost is null");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostIsNotNull() {
            addCriterion("cor_integrate_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostEqualTo(BigDecimal value) {
            addCriterion("cor_integrate_cost =", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostNotEqualTo(BigDecimal value) {
            addCriterion("cor_integrate_cost <>", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostGreaterThan(BigDecimal value) {
            addCriterion("cor_integrate_cost >", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_integrate_cost >=", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostLessThan(BigDecimal value) {
            addCriterion("cor_integrate_cost <", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_integrate_cost <=", value, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostIn(List<BigDecimal> values) {
            addCriterion("cor_integrate_cost in", values, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostNotIn(List<BigDecimal> values) {
            addCriterion("cor_integrate_cost not in", values, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_integrate_cost between", value1, value2, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorIntegrateCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_integrate_cost not between", value1, value2, "corIntegrateCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostIsNull() {
            addCriterion("cor_other_cost is null");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostIsNotNull() {
            addCriterion("cor_other_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostEqualTo(BigDecimal value) {
            addCriterion("cor_other_cost =", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostNotEqualTo(BigDecimal value) {
            addCriterion("cor_other_cost <>", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostGreaterThan(BigDecimal value) {
            addCriterion("cor_other_cost >", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_other_cost >=", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostLessThan(BigDecimal value) {
            addCriterion("cor_other_cost <", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_other_cost <=", value, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostIn(List<BigDecimal> values) {
            addCriterion("cor_other_cost in", values, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostNotIn(List<BigDecimal> values) {
            addCriterion("cor_other_cost not in", values, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_other_cost between", value1, value2, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorOtherCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_other_cost not between", value1, value2, "corOtherCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostIsNull() {
            addCriterion("cor_total_cost is null");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostIsNotNull() {
            addCriterion("cor_total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostEqualTo(BigDecimal value) {
            addCriterion("cor_total_cost =", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("cor_total_cost <>", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostGreaterThan(BigDecimal value) {
            addCriterion("cor_total_cost >", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_total_cost >=", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostLessThan(BigDecimal value) {
            addCriterion("cor_total_cost <", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_total_cost <=", value, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostIn(List<BigDecimal> values) {
            addCriterion("cor_total_cost in", values, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("cor_total_cost not in", values, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_total_cost between", value1, value2, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_total_cost not between", value1, value2, "corTotalCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostIsNull() {
            addCriterion("cor_can_use_cost is null");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostIsNotNull() {
            addCriterion("cor_can_use_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostEqualTo(BigDecimal value) {
            addCriterion("cor_can_use_cost =", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostNotEqualTo(BigDecimal value) {
            addCriterion("cor_can_use_cost <>", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostGreaterThan(BigDecimal value) {
            addCriterion("cor_can_use_cost >", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_can_use_cost >=", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostLessThan(BigDecimal value) {
            addCriterion("cor_can_use_cost <", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cor_can_use_cost <=", value, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostIn(List<BigDecimal> values) {
            addCriterion("cor_can_use_cost in", values, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostNotIn(List<BigDecimal> values) {
            addCriterion("cor_can_use_cost not in", values, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_can_use_cost between", value1, value2, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andCorCanUseCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cor_can_use_cost not between", value1, value2, "corCanUseCost");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsIsNull() {
            addCriterion("contract_info_ids is null");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsIsNotNull() {
            addCriterion("contract_info_ids is not null");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsEqualTo(String value) {
            addCriterion("contract_info_ids =", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsNotEqualTo(String value) {
            addCriterion("contract_info_ids <>", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsGreaterThan(String value) {
            addCriterion("contract_info_ids >", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsGreaterThanOrEqualTo(String value) {
            addCriterion("contract_info_ids >=", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsLessThan(String value) {
            addCriterion("contract_info_ids <", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsLessThanOrEqualTo(String value) {
            addCriterion("contract_info_ids <=", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsLike(String value) {
            addCriterion("contract_info_ids like", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsNotLike(String value) {
            addCriterion("contract_info_ids not like", value, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsIn(List<String> values) {
            addCriterion("contract_info_ids in", values, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsNotIn(List<String> values) {
            addCriterion("contract_info_ids not in", values, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsBetween(String value1, String value2) {
            addCriterion("contract_info_ids between", value1, value2, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andContractInfoIdsNotBetween(String value1, String value2) {
            addCriterion("contract_info_ids not between", value1, value2, "contractInfoIds");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardIsNull() {
            addCriterion("warranty_period_standard is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardIsNotNull() {
            addCriterion("warranty_period_standard is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardEqualTo(String value) {
            addCriterion("warranty_period_standard =", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardNotEqualTo(String value) {
            addCriterion("warranty_period_standard <>", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardGreaterThan(String value) {
            addCriterion("warranty_period_standard >", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_period_standard >=", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardLessThan(String value) {
            addCriterion("warranty_period_standard <", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardLessThanOrEqualTo(String value) {
            addCriterion("warranty_period_standard <=", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardLike(String value) {
            addCriterion("warranty_period_standard like", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardNotLike(String value) {
            addCriterion("warranty_period_standard not like", value, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardIn(List<String> values) {
            addCriterion("warranty_period_standard in", values, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardNotIn(List<String> values) {
            addCriterion("warranty_period_standard not in", values, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardBetween(String value1, String value2) {
            addCriterion("warranty_period_standard between", value1, value2, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodStandardNotBetween(String value1, String value2) {
            addCriterion("warranty_period_standard not between", value1, value2, "warrantyPeriodStandard");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodIsNull() {
            addCriterion("tender_warranty_period is null");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodIsNotNull() {
            addCriterion("tender_warranty_period is not null");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodEqualTo(String value) {
            addCriterion("tender_warranty_period =", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodNotEqualTo(String value) {
            addCriterion("tender_warranty_period <>", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodGreaterThan(String value) {
            addCriterion("tender_warranty_period >", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("tender_warranty_period >=", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodLessThan(String value) {
            addCriterion("tender_warranty_period <", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodLessThanOrEqualTo(String value) {
            addCriterion("tender_warranty_period <=", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodLike(String value) {
            addCriterion("tender_warranty_period like", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodNotLike(String value) {
            addCriterion("tender_warranty_period not like", value, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodIn(List<String> values) {
            addCriterion("tender_warranty_period in", values, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodNotIn(List<String> values) {
            addCriterion("tender_warranty_period not in", values, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodBetween(String value1, String value2) {
            addCriterion("tender_warranty_period between", value1, value2, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPeriodNotBetween(String value1, String value2) {
            addCriterion("tender_warranty_period not between", value1, value2, "tenderWarrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardIsNull() {
            addCriterion("warranty_price_standard is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardIsNotNull() {
            addCriterion("warranty_price_standard is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardEqualTo(String value) {
            addCriterion("warranty_price_standard =", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardNotEqualTo(String value) {
            addCriterion("warranty_price_standard <>", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardGreaterThan(String value) {
            addCriterion("warranty_price_standard >", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_price_standard >=", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardLessThan(String value) {
            addCriterion("warranty_price_standard <", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardLessThanOrEqualTo(String value) {
            addCriterion("warranty_price_standard <=", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardLike(String value) {
            addCriterion("warranty_price_standard like", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardNotLike(String value) {
            addCriterion("warranty_price_standard not like", value, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardIn(List<String> values) {
            addCriterion("warranty_price_standard in", values, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardNotIn(List<String> values) {
            addCriterion("warranty_price_standard not in", values, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardBetween(String value1, String value2) {
            addCriterion("warranty_price_standard between", value1, value2, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andWarrantyPriceStandardNotBetween(String value1, String value2) {
            addCriterion("warranty_price_standard not between", value1, value2, "warrantyPriceStandard");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceIsNull() {
            addCriterion("tender_warranty_price is null");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceIsNotNull() {
            addCriterion("tender_warranty_price is not null");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceEqualTo(BigDecimal value) {
            addCriterion("tender_warranty_price =", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceNotEqualTo(BigDecimal value) {
            addCriterion("tender_warranty_price <>", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceGreaterThan(BigDecimal value) {
            addCriterion("tender_warranty_price >", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_warranty_price >=", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceLessThan(BigDecimal value) {
            addCriterion("tender_warranty_price <", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_warranty_price <=", value, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceIn(List<BigDecimal> values) {
            addCriterion("tender_warranty_price in", values, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceNotIn(List<BigDecimal> values) {
            addCriterion("tender_warranty_price not in", values, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_warranty_price between", value1, value2, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andTenderWarrantyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_warranty_price not between", value1, value2, "tenderWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceIsNull() {
            addCriterion("can_use_without_warranty_price is null");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceIsNotNull() {
            addCriterion("can_use_without_warranty_price is not null");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceEqualTo(BigDecimal value) {
            addCriterion("can_use_without_warranty_price =", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceNotEqualTo(BigDecimal value) {
            addCriterion("can_use_without_warranty_price <>", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceGreaterThan(BigDecimal value) {
            addCriterion("can_use_without_warranty_price >", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("can_use_without_warranty_price >=", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceLessThan(BigDecimal value) {
            addCriterion("can_use_without_warranty_price <", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("can_use_without_warranty_price <=", value, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceIn(List<BigDecimal> values) {
            addCriterion("can_use_without_warranty_price in", values, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceNotIn(List<BigDecimal> values) {
            addCriterion("can_use_without_warranty_price not in", values, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("can_use_without_warranty_price between", value1, value2, "canUseWithoutWarrantyPrice");
            return (Criteria) this;
        }

        public Criteria andCanUseWithoutWarrantyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("can_use_without_warranty_price not between", value1, value2, "canUseWithoutWarrantyPrice");
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