/**
 *
 * @authors Your Name (you@example.org)
 * @date    2018-04-23 19:03
 * @version $Id$
 */
import React from 'react';
import {Component} from 'react';
import { Form, Input, Button, Checkbox } from 'antd';
//import { confirm } from 'jquery';
const FormItem = Form.Item;

class Demo extends Component{
    handleSubmit(e) {
        e.preventDefault();
        console.log('收到表单值：', this.props.form.getFieldsValue());
    }

    render() {
        const { getFieldProps } = this.props.form;
        return (
            <Form horizontal onSubmit={this.handleSubmit}>
                <FormItem
                    label="账户"
                >
                    <Input placeholder="请输入账户名"
                           {...getFieldProps('userName')}
                    />
                </FormItem>
                <FormItem
                    label="密码"
                >
                    <Input type="password" placeholder="请输入密码"
                           {...getFieldProps('password')}
                    />
                </FormItem>
                <FormItem>
                    <Checkbox {...getFieldProps('agreement')}>记住我</Checkbox>
                </FormItem>
                <Button type="primary" htmlType="submit">登录</Button>
                <Button type="primary" onClick="/register">注册</Button>
            </Form>
        );
    }
}

export default Demo;
