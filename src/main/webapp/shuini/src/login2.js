import React, { Component } from 'react';
import { confirm } from 'jquery';
class Reg extends Component {
    constructor(props){
        super(props);
        this.state = { // 初始化state
            username: '',
            password: ''
        }
    }
    stateChange(e){
        const target = e.target;
        this.setState({
            [target.name]: target.value
        })
    }
    loginUser() {
        const {
            username,
            password
            } = this.state;
        if(!username) return alert('用户名不能为空');
        if(!password) return alert('密码不能为空');
    }
    render() {
        return (
            <div onChange={(e)=>this.stateChange(e)} >
                <input name="username" value={this.state.username} placeholder="请输入用户名"/>
                <input name="password" value={this.state.password} placeholder="请输入密码"/>
                <button onClick={()=>this.loginUser()} >登录</button>
                <a href='reg'><button >注册</button></a>
                {this.props.children}
            </div>

        );
    }
}

export default Reg;