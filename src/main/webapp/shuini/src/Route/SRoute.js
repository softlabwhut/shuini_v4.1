import React, { Component } from 'react';
import { browserHistory } from 'react-router'
import {Router , Route , hashHistory } from 'react-router';
import Login from '../Login';
import Reg from '../Reg';
import App from '../App';
import Admin_app from '../adminComponent/Admin_app';
import TestA from '../TestA';
import UserAdd from '../pages/UserAdd';
import Home from '../pages/Home';
import MyAjax from '../api/MyAjax';
import MyFetch from '../api/MyFetch';


export default class SRoute extends Component {
    render(){
        return(
            <Router history={browserHistory}>
                <Route path="/" component={App}/>
                <Route path="/login" component={Login} >
                    <Route path="/login/A" component={TestA} />
                </Route>
                <Route path="/reg" component={Reg}/>
                <Route path="/user" component={Home}/>
                <Route path="/user/add" component={UserAdd}/>
                <Route path="/fetch" component={MyFetch}/>
                <Route path="/!" component={TestA}/>
                <Route path="/ajax" component={MyAjax}/>

            </Router>
        )
    }
}
