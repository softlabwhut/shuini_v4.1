import React,{Component} from 'react'
import $ from 'jquery'

class MyAjax extends Component{
    constructor(props){
        super(props);
        this.state={
            source:"http://localhost:3001/user",
            alls:[]
        }
    }
    componentDidMount(){
        this.serverRequest = $.get(this.state.source, function (result) {
            //var lastGist = result;
            this.setState({
                alls:result
            });
        }.bind(this));
    }

    componentWillUnmount() {
        this.serverRequest.abort();
    }

    render(){
        return (
            <div>
                {
                    this.state.alls.map(function (item, index) {
                        return(
                            <ul key="index">
                                <li> 序号：{index}</li>
                                <li>姓名：{item.name}</li>
                                <li>姓名：{item.age}</li>
                            </ul>
                        )

                    })
                }
            </div>
        )
    }

}
export default MyAjax;