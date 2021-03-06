/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.linhome.lib.dialog;

import android.view.View;
import android.widget.BaseAdapter;


import java.util.List;

import cn.linhome.lib.dialog.impl.FDialog;

public interface FIDialogMenu
{
    /**
     * 设置标题文字
     *
     * @param text
     * @return
     */
    FIDialogMenu setTextTitle(String text);

    /**
     * 设置取消文字
     *
     * @param text
     * @return
     */
    FIDialogMenu setTextCancel(String text);

    /**
     * 设置回调
     *
     * @param callback
     * @return
     */
    FIDialogMenu setCallback(Callback callback);

    /**
     * 设置列表数据
     *
     * @param objects
     * @return
     */
    FIDialogMenu setItems(Object... objects);

    /**
     * 设置列表数据
     *
     * @param listObject
     * @return
     */
    FIDialogMenu setItems(List<Object> listObject);

    /**
     * 设置适配器
     *
     * @param adapter
     * @return
     */
    FIDialogMenu setAdapter(BaseAdapter adapter);


    interface Callback
    {
        void onClickItem(View v, int index, FDialog dialog);

        void onClickCancel(View v, FDialog dialog);
    }
}
