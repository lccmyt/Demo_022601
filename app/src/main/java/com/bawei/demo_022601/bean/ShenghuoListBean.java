package com.bawei.demo_022601.bean;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.bean
 * @ClassName: ShenghuoListBean
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/27 16:48
 */
public class ShenghuoListBean {
    /**
     * result : {"rxxp":{"commodityList":[{"commodityId":27,"commodityName":"休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/3/1.jpg","price":139,"saleNum":371},{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":436},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":429}],"id":1002,"name":"热销新品"},"pzsh":{"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":149},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2056}],"id":1004,"name":"品质生活"},"mlss":{"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":18,"commodityName":"白色经典 秋季新款简约百搭轻便休闲女鞋板鞋小白鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/1/1.jpg","price":79,"saleNum":594}],"id":1003,"name":"魔力时尚"}}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * rxxp : {"commodityList":[{"commodityId":27,"commodityName":"休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/3/1.jpg","price":139,"saleNum":371},{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":436},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":429}],"id":1002,"name":"热销新品"}
         * pzsh : {"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":149},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2056}],"id":1004,"name":"品质生活"}
         * mlss : {"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":18,"commodityName":"白色经典 秋季新款简约百搭轻便休闲女鞋板鞋小白鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/1/1.jpg","price":79,"saleNum":594}],"id":1003,"name":"魔力时尚"}
         */

        private RxxpBean rxxp;
        private PzshBean pzsh;
        private MlssBean mlss;

        public RxxpBean getRxxp() {
            return rxxp;
        }

        public void setRxxp(RxxpBean rxxp) {
            this.rxxp = rxxp;
        }

        public PzshBean getPzsh() {
            return pzsh;
        }

        public void setPzsh(PzshBean pzsh) {
            this.pzsh = pzsh;
        }

        public MlssBean getMlss() {
            return mlss;
        }

        public void setMlss(MlssBean mlss) {
            this.mlss = mlss;
        }

        public static class RxxpBean {
            /**
             * commodityList : [{"commodityId":27,"commodityName":"休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/3/1.jpg","price":139,"saleNum":371},{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":436},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":429}]
             * id : 1002
             * name : 热销新品
             */

            private int id;
            private String name;
            private List<CommodityListBean> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBean> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBean> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBean {
                /**
                 * commodityId : 27
                 * commodityName : 休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/nx/ddx/3/1.jpg
                 * price : 139
                 * saleNum : 371
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class PzshBean {
            /**
             * commodityList : [{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":149},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2056}]
             * id : 1004
             * name : 品质生活
             */

            private int id;
            private String name;
            private List<CommodityListBeanX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanX {
                /**
                 * commodityId : 6
                 * commodityName : 轻柔系自然裸妆假睫毛
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg
                 * price : 39
                 * saleNum : 441
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class MlssBean {
            /**
             * commodityList : [{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":18,"commodityName":"白色经典 秋季新款简约百搭轻便休闲女鞋板鞋小白鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/1/1.jpg","price":79,"saleNum":594}]
             * id : 1003
             * name : 魔力时尚
             */

            private int id;
            private String name;
            private List<CommodityListBeanXX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanXX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanXX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanXX {
                /**
                 * commodityId : 32
                 * commodityName : 唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg
                 * price : 88
                 * saleNum : 812
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }
    }
}