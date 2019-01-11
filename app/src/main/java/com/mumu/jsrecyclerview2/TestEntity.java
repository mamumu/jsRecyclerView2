package com.mumu.jsrecyclerview2;

import java.io.Serializable;
import java.util.List;

public class TestEntity implements Serializable {

    /**
     * Success : true
     * StatusCode : 200
     * Result : {"list":[{"TestTitle":"我爱小狗","TestNessage":"我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗"},{"TestTitle":"我爱小狗","TestNessage":"我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗"},{"TestTitle":"我爱小狗","TestNessage":"我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗"},{"TestTitle":"我爱小狗","TestNessage":"我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗"},{"TestTitle":"我爱小狗","TestNessage":"我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗"}]}
     */

    private ResultBean Result;

    public ResultBean getResult() {
        return Result;
    }

    public void setResult(ResultBean Result) {
        this.Result = Result;
    }

    public static class ResultBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * TestTitle : 我爱小狗
             * TestMessage : 我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗我爱小狗
             * isShow: 是否显示详细消息，后台没有返回，属于自己添加赋值，用来记录每一个item的显示详情状态
             */

            private String TestTitle;
            private String TestMessage;
            private boolean isShow = false;

            public boolean isShow() {
                return isShow;
            }

            public void setShow(boolean show) {
                isShow = show;
            }

            public ListBean(String aaa, String bbb) {
                TestTitle = aaa;
                TestMessage = bbb;
            }

            public String getTestTitle() {
                return TestTitle;
            }

            public void setTestTitle(String TestTitle) {
                this.TestTitle = TestTitle;
            }

            public String getTestMessage() {
                return TestMessage;
            }

            public void setTestMessage(String TestMessage) {
                this.TestMessage = TestMessage;
            }
        }
    }
}
