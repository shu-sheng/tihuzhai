/*
 Navicat Premium Data Transfer

 Source Server         : 彬彬云PGSQL
 Source Server Type    : PostgreSQL
 Source Server Version : 90615
 Source Host           : 47.106.102.151:5432
 Source Catalog        : tihuboss
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 90615
 File Encoding         : 65001

 Date: 11/09/2019 19:11:44
*/


-- ----------------------------
-- Sequence structure for ac_menu_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."ac_menu_id_seq";
CREATE SEQUENCE "public"."ac_menu_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for ac_role_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."ac_role_id_seq";
CREATE SEQUENCE "public"."ac_role_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for ac_role_menu_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."ac_role_menu_id_seq";
CREATE SEQUENCE "public"."ac_role_menu_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for ac_user_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."ac_user_id_seq";
CREATE SEQUENCE "public"."ac_user_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for ac_user_role_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."ac_user_role_id_seq";
CREATE SEQUENCE "public"."ac_user_role_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for ac_menu
-- ----------------------------
DROP TABLE IF EXISTS "public"."ac_menu";
CREATE TABLE "public"."ac_menu" (
  "id" int4 NOT NULL DEFAULT nextval('ac_menu_id_seq'::regclass),
  "parent_id" int8,
  "menu_name" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "menu_code" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "menu_type" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "menu_order" int4,
  "permission_url" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "menu_status" varchar(20) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
    "memo" varchar(255) COLLATE "pg_catalog"."default",
  "row_add_time" date,
  "row_update_time" date
)
;
COMMENT ON COLUMN "public"."ac_menu"."id" IS '菜单ID';
COMMENT ON COLUMN "public"."ac_menu"."parent_id" IS '父菜单ID';
COMMENT ON COLUMN "public"."ac_menu"."menu_name" IS '菜单名称';
COMMENT ON COLUMN "public"."ac_menu"."menu_code" IS '菜单编码';
COMMENT ON COLUMN "public"."ac_menu"."menu_type" IS '菜单类型';
COMMENT ON COLUMN "public"."ac_menu"."menu_order" IS '菜单顺序';
COMMENT ON COLUMN "public"."ac_menu"."permission_url" IS '权限URL';
COMMENT ON COLUMN "public"."ac_menu"."menu_status" IS '状态';
COMMENT ON COLUMN "public"."ac_menu"."memo" IS '备注';
COMMENT ON COLUMN "public"."ac_menu"."row_add_time" IS '添加时间';
COMMENT ON COLUMN "public"."ac_menu"."row_update_time" IS '更新时间';

-- ----------------------------
-- Table structure for ac_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."ac_role";
CREATE TABLE "public"."ac_role" (
  "id" int4 NOT NULL DEFAULT nextval('ac_role_id_seq'::regclass),
  "role_name" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "role_type" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "role_status" varchar(20) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "memo" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "row_add_time" date,
  "row_update_time" date
)
;
COMMENT ON COLUMN "public"."ac_role"."id" IS '角色ID';
COMMENT ON COLUMN "public"."ac_role"."role_name" IS '角色名称';
COMMENT ON COLUMN "public"."ac_role"."role_type" IS '角色类型';
COMMENT ON COLUMN "public"."ac_role"."role_status" IS '角色状态';
COMMENT ON COLUMN "public"."ac_role"."memo" IS '备注';
COMMENT ON COLUMN "public"."ac_role"."row_add_time" IS '添加时间';
COMMENT ON COLUMN "public"."ac_role"."row_update_time" IS '更新时间';

-- ----------------------------
-- Table structure for ac_role_menu
-- ----------------------------
DROP TABLE IF EXISTS "public"."ac_role_menu";
CREATE TABLE "public"."ac_role_menu" (
  "id" int4 NOT NULL DEFAULT nextval('ac_role_menu_id_seq'::regclass),
  "role_id" int8,
  "menu_id" int8,
  "status" varchar(255) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "row_add_time" date
)
;
COMMENT ON COLUMN "public"."ac_role_menu"."id" IS '角色菜单关联ID';
COMMENT ON COLUMN "public"."ac_role_menu"."role_id" IS '角色ID';
COMMENT ON COLUMN "public"."ac_role_menu"."menu_id" IS '菜单ID';
COMMENT ON COLUMN "public"."ac_role_menu"."status" IS '状态';
COMMENT ON COLUMN "public"."ac_role_menu"."row_add_time" IS '添加时间';

-- ----------------------------
-- Table structure for ac_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."ac_user";
CREATE TABLE "public"."ac_user" (
  "id" int4 NOT NULL DEFAULT nextval('ac_user_id_seq'::regclass),
  "user_name" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "user_real_name" varchar(30) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "password" varchar(50) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "email" varchar(128) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "mobile" varchar(16) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "password_error_times" int4,
  "user_status" varchar(20) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "memo" varchar(256) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "row_add_time" date,
  "row_update_time" date
)
;
COMMENT ON COLUMN "public"."ac_user"."id" IS '用户ID';
COMMENT ON COLUMN "public"."ac_user"."user_name" IS '用户名
';
COMMENT ON COLUMN "public"."ac_user"."user_real_name" IS '用户真实姓名';
COMMENT ON COLUMN "public"."ac_user"."password" IS '密码';
COMMENT ON COLUMN "public"."ac_user"."email" IS '邮箱';
COMMENT ON COLUMN "public"."ac_user"."mobile" IS '电话';
COMMENT ON COLUMN "public"."ac_user"."password_error_times" IS '登录错误次数';
COMMENT ON COLUMN "public"."ac_user"."user_status" IS '用户状态';
COMMENT ON COLUMN "public"."ac_user"."memo" IS '备注';
COMMENT ON COLUMN "public"."ac_user"."row_add_time" IS '添加时间';
COMMENT ON COLUMN "public"."ac_user"."row_update_time" IS '更新时间';

-- ----------------------------
-- Table structure for ac_user_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."ac_user_role";
CREATE TABLE "public"."ac_user_role" (
  "id" int4 NOT NULL DEFAULT nextval('ac_user_role_id_seq'::regclass),
  "user_id" int8,
  "role_id" int8,
  "status" varchar(20) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying,
  "row_add_time" date
)
;
COMMENT ON COLUMN "public"."ac_user_role"."id" IS '用户角色关联ID';
COMMENT ON COLUMN "public"."ac_user_role"."user_id" IS '用户ID';
COMMENT ON COLUMN "public"."ac_user_role"."role_id" IS '角色ID';
COMMENT ON COLUMN "public"."ac_user_role"."status" IS '状态';
COMMENT ON COLUMN "public"."ac_user_role"."row_add_time" IS '添加时间';

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."ac_menu_id_seq"
OWNED BY "public"."ac_menu"."id";
SELECT setval('"public"."ac_menu_id_seq"', 2, false);
ALTER SEQUENCE "public"."ac_role_id_seq"
OWNED BY "public"."ac_role"."id";
SELECT setval('"public"."ac_role_id_seq"', 2, false);
ALTER SEQUENCE "public"."ac_role_menu_id_seq"
OWNED BY "public"."ac_role_menu"."id";
SELECT setval('"public"."ac_role_menu_id_seq"', 2, false);
ALTER SEQUENCE "public"."ac_user_id_seq"
OWNED BY "public"."ac_user"."id";
SELECT setval('"public"."ac_user_id_seq"', 2, false);
ALTER SEQUENCE "public"."ac_user_role_id_seq"
OWNED BY "public"."ac_user_role"."id";
SELECT setval('"public"."ac_user_role_id_seq"', 2, false);

-- ----------------------------
-- Uniques structure for table ac_menu
-- ----------------------------
ALTER TABLE "public"."ac_menu" ADD CONSTRAINT "fk_reference_9" UNIQUE ("parent_id");

-- ----------------------------
-- Primary Key structure for table ac_menu
-- ----------------------------
ALTER TABLE "public"."ac_menu" ADD CONSTRAINT "pk_ac_menu" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table ac_role
-- ----------------------------
ALTER TABLE "public"."ac_role" ADD CONSTRAINT "pk_ac_role" PRIMARY KEY ("id");

-- ----------------------------
-- Uniques structure for table ac_role_menu
-- ----------------------------
ALTER TABLE "public"."ac_role_menu" ADD CONSTRAINT "fk_reference_7" UNIQUE ("role_id");
ALTER TABLE "public"."ac_role_menu" ADD CONSTRAINT "fk_reference_8" UNIQUE ("menu_id");

-- ----------------------------
-- Primary Key structure for table ac_role_menu
-- ----------------------------
ALTER TABLE "public"."ac_role_menu" ADD CONSTRAINT "pk_ac_role_menu" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table ac_user
-- ----------------------------
ALTER TABLE "public"."ac_user" ADD CONSTRAINT "pk_ac_user" PRIMARY KEY ("id");

-- ----------------------------
-- Uniques structure for table ac_user_role
-- ----------------------------
ALTER TABLE "public"."ac_user_role" ADD CONSTRAINT "fk_reference_3" UNIQUE ("user_id");
ALTER TABLE "public"."ac_user_role" ADD CONSTRAINT "fk_reference_4" UNIQUE ("role_id");

-- ----------------------------
-- Primary Key structure for table ac_user_role
-- ----------------------------
ALTER TABLE "public"."ac_user_role" ADD CONSTRAINT "pk_ac_user_role" PRIMARY KEY ("id");
