-- begin CEUA_ORDER
alter table CEUA_ORDER add constraint FK_CEUA_ORDER_CUSTOMER foreign key (CUSTOMER_ID) references CEUA_CUSTOMER(ID)^
create index IDX_CEUA_ORDER_CUSTOMER on CEUA_ORDER (CUSTOMER_ID)^
-- end CEUA_ORDER
