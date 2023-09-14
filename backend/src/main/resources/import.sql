

--tb_account
INSERT INTO tb_account (number, agency, balance, account_limit) VALUES ('123456', '0001', 1150, 2000);

--tb_account
INSERT INTO tb_card (number, card_limit) VALUES ('123456', 2000);

--tb_article
INSERT INTO tb_article (icon, description) VALUES ('new', 'page com new');

--tb_feature
INSERT INTO tb_feature (icon, description) VALUES ('pix', 'page com pix');

--tb_user
INSERT INTO tb_user (account_id, card_id, name ) VALUES (1, 1, 'Claudio Cardoso');