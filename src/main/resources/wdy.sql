
CREATE TABLE IF NOT EXISTS `wdy_answer_detail` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `answer_id` varchar(32) NOT NULL DEFAULT '0',
  `question_id` varchar(32) NOT NULL DEFAULT '0',
  `answer_option` varchar(256) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `answer_desc` varchar(512) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `wdy_question` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `qs_id` varchar(32) NOT NULL DEFAULT '0',
  `question` varchar(256) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `sort` int(4) NOT NULL DEFAULT '1',
  `type` int(4) NOT NULL DEFAULT '0',
  `is_need` int(4) NOT NULL DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微调研问题表';

CREATE TABLE IF NOT EXISTS `wdy_question_answer` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `qs_id` varchar(32) NOT NULL DEFAULT '0',
  `user_id` varchar(32) NOT NULL DEFAULT '0',
  `question_id` varchar(32) NOT NULL DEFAULT '0',
  `answer_option` varchar(256) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `answer_desc` varchar(512) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `cost` int(4) NOT NULL DEFAULT '0',
  `source` int(4) NOT NULL DEFAULT '0',
  `from_ip` varchar(128) CHARACTER SET latin1 NOT NULL DEFAULT '' COMMENT '来源IP',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '回答是否有效',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `wdy_question_option` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `question_id` varchar(32) NOT NULL DEFAULT '0',
  `option_key` varchar(32) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `option_val` varchar(256) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `option_sort` int(4) NOT NULL DEFAULT '1',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `wdy_questionnaire` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `sp_id` varchar(32) NOT NULL DEFAULT '0',
  `questionnaire_title` varchar(128) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `questionnaire_desc` varchar(512) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `result_prompt` varchar(512) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `questionnaire_status` int(4) NOT NULL DEFAULT '0',
  `release_time` datetime NOT NULL COMMENT '发布时间',
  `deadline` datetime NOT NULL COMMENT '截止时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='微调研问卷表';

CREATE TABLE IF NOT EXISTS `wdy_statistics` (
  `id` varchar(32) NOT NULL DEFAULT '0',
  `sp_id` varchar(32) NOT NULL DEFAULT '0',
  `qs_id` varchar(32) NOT NULL DEFAULT '0',
  `problem_total` int(4) NOT NULL DEFAULT '0',
  `visitor_num` int(11) NOT NULL DEFAULT '0',
  `submit_num` int(11) NOT NULL DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `del_flag` int(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问卷统计表';


INSERT INTO `wdy_questionnaire` (`id`,`sp_id`,`questionnaire_title`,`questionnaire_desc`,`result_prompt`,`questionnaire_status`,`release_time`,`deadline`,`create_time`,`update_time`,`del_flag`) VALUES (1,1,'12356','aaa','asdfafs',0,'2017-02-20 21:54:08','2017-02-20 21:54:08','2017-02-21 10:00:25','2017-02-21 10:00:25',0);
INSERT INTO `wdy_questionnaire` (`id`,`sp_id`,`questionnaire_title`,`questionnaire_desc`,`result_prompt`,`questionnaire_status`,`release_time`,`deadline`,`create_time`,`update_time`,`del_flag`) VALUES (3,1,'3333','2222','asdfafs',0,'2017-02-20 21:54:08','2017-02-20 21:54:08','2017-02-21 10:00:53','2017-02-21 10:00:53',0);