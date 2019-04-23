package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiChineseWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiChineseWordExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeIsNull() {
            addCriterion("teaching_material_first_type is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeIsNotNull() {
            addCriterion("teaching_material_first_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeEqualTo(String value) {
            addCriterion("teaching_material_first_type =", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeNotEqualTo(String value) {
            addCriterion("teaching_material_first_type <>", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeGreaterThan(String value) {
            addCriterion("teaching_material_first_type >", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_material_first_type >=", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeLessThan(String value) {
            addCriterion("teaching_material_first_type <", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeLessThanOrEqualTo(String value) {
            addCriterion("teaching_material_first_type <=", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeLike(String value) {
            addCriterion("teaching_material_first_type like", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeNotLike(String value) {
            addCriterion("teaching_material_first_type not like", value, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeIn(List<String> values) {
            addCriterion("teaching_material_first_type in", values, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeNotIn(List<String> values) {
            addCriterion("teaching_material_first_type not in", values, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeBetween(String value1, String value2) {
            addCriterion("teaching_material_first_type between", value1, value2, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialFirstTypeNotBetween(String value1, String value2) {
            addCriterion("teaching_material_first_type not between", value1, value2, "teachingMaterialFirstType");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNull() {
            addCriterion("page_no is null");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNotNull() {
            addCriterion("page_no is not null");
            return (Criteria) this;
        }

        public Criteria andPageNoEqualTo(Integer value) {
            addCriterion("page_no =", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotEqualTo(Integer value) {
            addCriterion("page_no <>", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThan(Integer value) {
            addCriterion("page_no >", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_no >=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThan(Integer value) {
            addCriterion("page_no <", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThanOrEqualTo(Integer value) {
            addCriterion("page_no <=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoIn(List<Integer> values) {
            addCriterion("page_no in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotIn(List<Integer> values) {
            addCriterion("page_no not in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoBetween(Integer value1, Integer value2) {
            addCriterion("page_no between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotBetween(Integer value1, Integer value2) {
            addCriterion("page_no not between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andPinYinIsNull() {
            addCriterion("pin_yin is null");
            return (Criteria) this;
        }

        public Criteria andPinYinIsNotNull() {
            addCriterion("pin_yin is not null");
            return (Criteria) this;
        }

        public Criteria andPinYinEqualTo(String value) {
            addCriterion("pin_yin =", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotEqualTo(String value) {
            addCriterion("pin_yin <>", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinGreaterThan(String value) {
            addCriterion("pin_yin >", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinGreaterThanOrEqualTo(String value) {
            addCriterion("pin_yin >=", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLessThan(String value) {
            addCriterion("pin_yin <", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLessThanOrEqualTo(String value) {
            addCriterion("pin_yin <=", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLike(String value) {
            addCriterion("pin_yin like", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotLike(String value) {
            addCriterion("pin_yin not like", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinIn(List<String> values) {
            addCriterion("pin_yin in", values, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotIn(List<String> values) {
            addCriterion("pin_yin not in", values, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinBetween(String value1, String value2) {
            addCriterion("pin_yin between", value1, value2, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotBetween(String value1, String value2) {
            addCriterion("pin_yin not between", value1, value2, "pinYin");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterIsNull() {
            addCriterion("first_character is null");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterIsNotNull() {
            addCriterion("first_character is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterEqualTo(String value) {
            addCriterion("first_character =", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterNotEqualTo(String value) {
            addCriterion("first_character <>", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterGreaterThan(String value) {
            addCriterion("first_character >", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("first_character >=", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterLessThan(String value) {
            addCriterion("first_character <", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterLessThanOrEqualTo(String value) {
            addCriterion("first_character <=", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterLike(String value) {
            addCriterion("first_character like", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterNotLike(String value) {
            addCriterion("first_character not like", value, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterIn(List<String> values) {
            addCriterion("first_character in", values, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterNotIn(List<String> values) {
            addCriterion("first_character not in", values, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterBetween(String value1, String value2) {
            addCriterion("first_character between", value1, value2, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andFirstCharacterNotBetween(String value1, String value2) {
            addCriterion("first_character not between", value1, value2, "firstCharacter");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlIsNull() {
            addCriterion("chinese_video_url is null");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlIsNotNull() {
            addCriterion("chinese_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlEqualTo(String value) {
            addCriterion("chinese_video_url =", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlNotEqualTo(String value) {
            addCriterion("chinese_video_url <>", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlGreaterThan(String value) {
            addCriterion("chinese_video_url >", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_video_url >=", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlLessThan(String value) {
            addCriterion("chinese_video_url <", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("chinese_video_url <=", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlLike(String value) {
            addCriterion("chinese_video_url like", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlNotLike(String value) {
            addCriterion("chinese_video_url not like", value, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlIn(List<String> values) {
            addCriterion("chinese_video_url in", values, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlNotIn(List<String> values) {
            addCriterion("chinese_video_url not in", values, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlBetween(String value1, String value2) {
            addCriterion("chinese_video_url between", value1, value2, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andChineseVideoUrlNotBetween(String value1, String value2) {
            addCriterion("chinese_video_url not between", value1, value2, "chineseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlIsNull() {
            addCriterion("korean_video_url is null");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlIsNotNull() {
            addCriterion("korean_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlEqualTo(String value) {
            addCriterion("korean_video_url =", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlNotEqualTo(String value) {
            addCriterion("korean_video_url <>", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlGreaterThan(String value) {
            addCriterion("korean_video_url >", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("korean_video_url >=", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlLessThan(String value) {
            addCriterion("korean_video_url <", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("korean_video_url <=", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlLike(String value) {
            addCriterion("korean_video_url like", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlNotLike(String value) {
            addCriterion("korean_video_url not like", value, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlIn(List<String> values) {
            addCriterion("korean_video_url in", values, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlNotIn(List<String> values) {
            addCriterion("korean_video_url not in", values, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlBetween(String value1, String value2) {
            addCriterion("korean_video_url between", value1, value2, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andKoreanVideoUrlNotBetween(String value1, String value2) {
            addCriterion("korean_video_url not between", value1, value2, "koreanVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlIsNull() {
            addCriterion("english_video_url is null");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlIsNotNull() {
            addCriterion("english_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlEqualTo(String value) {
            addCriterion("english_video_url =", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlNotEqualTo(String value) {
            addCriterion("english_video_url <>", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlGreaterThan(String value) {
            addCriterion("english_video_url >", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("english_video_url >=", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlLessThan(String value) {
            addCriterion("english_video_url <", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("english_video_url <=", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlLike(String value) {
            addCriterion("english_video_url like", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlNotLike(String value) {
            addCriterion("english_video_url not like", value, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlIn(List<String> values) {
            addCriterion("english_video_url in", values, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlNotIn(List<String> values) {
            addCriterion("english_video_url not in", values, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlBetween(String value1, String value2) {
            addCriterion("english_video_url between", value1, value2, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andEnglishVideoUrlNotBetween(String value1, String value2) {
            addCriterion("english_video_url not between", value1, value2, "englishVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlIsNull() {
            addCriterion("japanese_video_url is null");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlIsNotNull() {
            addCriterion("japanese_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlEqualTo(String value) {
            addCriterion("japanese_video_url =", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlNotEqualTo(String value) {
            addCriterion("japanese_video_url <>", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlGreaterThan(String value) {
            addCriterion("japanese_video_url >", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("japanese_video_url >=", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlLessThan(String value) {
            addCriterion("japanese_video_url <", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("japanese_video_url <=", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlLike(String value) {
            addCriterion("japanese_video_url like", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlNotLike(String value) {
            addCriterion("japanese_video_url not like", value, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlIn(List<String> values) {
            addCriterion("japanese_video_url in", values, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlNotIn(List<String> values) {
            addCriterion("japanese_video_url not in", values, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlBetween(String value1, String value2) {
            addCriterion("japanese_video_url between", value1, value2, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andJapaneseVideoUrlNotBetween(String value1, String value2) {
            addCriterion("japanese_video_url not between", value1, value2, "japaneseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlIsNull() {
            addCriterion("voice_url is null");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlIsNotNull() {
            addCriterion("voice_url is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlEqualTo(String value) {
            addCriterion("voice_url =", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlNotEqualTo(String value) {
            addCriterion("voice_url <>", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlGreaterThan(String value) {
            addCriterion("voice_url >", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("voice_url >=", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlLessThan(String value) {
            addCriterion("voice_url <", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlLessThanOrEqualTo(String value) {
            addCriterion("voice_url <=", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlLike(String value) {
            addCriterion("voice_url like", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlNotLike(String value) {
            addCriterion("voice_url not like", value, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlIn(List<String> values) {
            addCriterion("voice_url in", values, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlNotIn(List<String> values) {
            addCriterion("voice_url not in", values, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlBetween(String value1, String value2) {
            addCriterion("voice_url between", value1, value2, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andVoiceUrlNotBetween(String value1, String value2) {
            addCriterion("voice_url not between", value1, value2, "voiceUrl");
            return (Criteria) this;
        }

        public Criteria andWordImgIsNull() {
            addCriterion("word_img is null");
            return (Criteria) this;
        }

        public Criteria andWordImgIsNotNull() {
            addCriterion("word_img is not null");
            return (Criteria) this;
        }

        public Criteria andWordImgEqualTo(String value) {
            addCriterion("word_img =", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgNotEqualTo(String value) {
            addCriterion("word_img <>", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgGreaterThan(String value) {
            addCriterion("word_img >", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgGreaterThanOrEqualTo(String value) {
            addCriterion("word_img >=", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgLessThan(String value) {
            addCriterion("word_img <", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgLessThanOrEqualTo(String value) {
            addCriterion("word_img <=", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgLike(String value) {
            addCriterion("word_img like", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgNotLike(String value) {
            addCriterion("word_img not like", value, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgIn(List<String> values) {
            addCriterion("word_img in", values, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgNotIn(List<String> values) {
            addCriterion("word_img not in", values, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgBetween(String value1, String value2) {
            addCriterion("word_img between", value1, value2, "wordImg");
            return (Criteria) this;
        }

        public Criteria andWordImgNotBetween(String value1, String value2) {
            addCriterion("word_img not between", value1, value2, "wordImg");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
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