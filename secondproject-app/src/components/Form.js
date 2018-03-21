import React, { Component } from "react";

const Form = props => (
  <form onSubmit={props.getWeather}>
    {/* this.getWeather ? this.props.getWeather? */}
    <input type="text" name="city" placeholder="City" />
    <input type="text" name="country" placeholder="Country" />
    <button>Find weather</button>
  </form>
)

export default Form;
