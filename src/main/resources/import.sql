-- PRODUCT
INSERT INTO PRODUCT (ID,BAR_CODE,NAME,PRICE) VALUES (1,'M20140','Mi Smart Band 4 (Black)',150);
INSERT INTO PRODUCT (ID,BAR_CODE,NAME,PRICE) VALUES (2,'75TI748','Fire TV Stick with all-new Alexa Voice Remote',1000);
INSERT INTO PRODUCT (ID,BAR_CODE,NAME,PRICE) VALUES (3,'KJ471205','NOKIA 105 2019 (Dual SIM, Black)',6050);
INSERT INTO PRODUCT (ID,BAR_CODE,NAME,PRICE) VALUES (4,'OP74OLK','SanDisk Ultra Dual 32GB USB 3.0 OTG Pen Drive',350);
INSERT INTO PRODUCT (ID,BAR_CODE,NAME,PRICE) VALUES (5,'QA4FG02','Logitech B170 Wireless Mouse (Black)',975);

-- SALE_ORDER
INSERT INTO SALE_ORDER ( ID,AMOUNT_TAX , AMOUNT_TOTAL, AMOUNT_UNTAXED , ORDER_DATE, ORIGIN , REFERENCE , VALIDITY_DATE )  
VALUES  (1,50,1350,1300,NOW(),'001','0505',NOW()+1);

-- SALE_ORDER_LINE
INSERT INTO SALE_ORDER_LINE (ID, AMOUNT_TAX , DESCRIPTION , ORDER_ID , PRICE_UNIT , PRODUCT_ID , QUANTITY,DISCOUNT  ) VALUES (1,25,NULL,1,150,1,2,0); 
INSERT INTO SALE_ORDER_LINE (ID, AMOUNT_TAX , DESCRIPTION , ORDER_ID , PRICE_UNIT , PRODUCT_ID , QUANTITY,DISCOUNT  ) VALUES (2,25,NULL,1,1000,2,1,0); 