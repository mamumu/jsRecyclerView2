package com.mumu.jsrecyclerview2;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

public class TestAdapter extends BaseQuickAdapter<TestEntity.ResultBean.ListBean, BaseViewHolder> {

    /**
     * 增加一个构造方法，便于没有数据时候初始化适配器
     */
    public TestAdapter() {
        super(R.layout.item_test);
    }

    /**
     * 继承BaseQuickAdapter后需要重写的方法
     *
     * @param helper view持有者，为重用view而设计，减少每次创建view的内存消耗
     * @param data   我们的列表数据
     */
    @Override
    protected void convert(BaseViewHolder helper, TestEntity.ResultBean.ListBean data) {
        // TODO: 2019/1/10 需要详细说明的点：每一个子控件都要赋值操作，不然会造成数据混乱 ，如没有给箭头赋值，在点击
        // TODO: 2019/1/10 展开隐藏的时候箭头的赋值会发生错乱（点击第一个，第十一个数据也会更改）
        //将每一个需要赋值的id和对应的数据绑定，绑定title和message
        helper.setText(R.id.tv_item_title, data.getTestTitle())
                .setText(R.id.tv_item_message, data.getTestMessage());
        //设置箭头切换
        if(data.isShow()){
            helper.setImageResource(R.id.iv_item_arrow, R.mipmap.rw_arrow_1);
        }else {
            helper.setImageResource(R.id.iv_item_arrow, R.mipmap.rw_arrow_2);
        }
        //设置详细消息布局隐藏
        helper.setGone(R.id.ll_item_message, data.isShow());
        //设置title的点击监听
        helper.addOnClickListener(R.id.rl_item_title);
    }
}
