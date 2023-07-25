import logo from './logo.svg';
import './App.css';
import React from 'react';

async function fetchProducts(){
  const response=await fetch('https://fakestoreapi.com/products');
  const products=await response.json();
  //.then(res=>res.json())
  //.then(json=>console.log(json))
  console.log(products)
  return products;
}

// const products=[
//   {
//     id:1,
//     title:"Backpack" ,
//     description:"A Backpack with a laptop compartment" ,
//     price:"Rs. 2,000"
    
//   },
//   {
//     id:2,
//     title:"water bottle" ,
//     description:"A Backpack with a laptop compartment" ,
//     price:"Rs. 1,000"
    
//   },
//   {
//     id:3,
//     title:"shoes" ,
//     description:"A pair of running shoes" ,
//     price:"Rs. 5,000"
    
//   },
// ]

// function onAdd({title}){
//   //console.log("added!")
//   alert( title +"added!");
// }
function Product({title,description,price}){
  function onAdd({}){
    //console.log("added!")
    alert( title +" added!");
    
  }
  return(
  <div>
    <h2>
          {title}
        </h2>
        <p>{description}</p>
        <p>{price}</p>
        <button type='button' onClick={onAdd}>Add to cart</button>
  </div>
  );
}


function App() {
  const [cart,setcart]=React.useState([]);
  const [products,setProducts]=React.useState([]);
  React.useEffect(()=>{
    async function initialize(){
      const data=await fetchProducts();
      setProducts(data)
    }
    initialize();
  },[])
  
  return (
    <div className="produc-list">
      {/* {products.map((product) =>(
        <Product 
        title={product.title} 
        description={product.description} 
        price={product.price}
        />
      ))} */}
    {products.map(({id,title,description,price}) =>(
        <Product 
        key={id}
        title={title} 
        description={description} 
        price={price}
        onAdd={()=>setcart((cart)=>[...cart,{id,title,description,price}])}
        />
      ))} 
      <div>
        <p>Number of item: {cart.length}</p>
        {cart.map(({id,title}) =>(
          <div>
          {title}
          </div>
      ))} 
      </div>
      
      
      {/* <Product 
      title="Backpack" 
      description="A Backpack with a laptop compartment" 
      price="Rs. 5,000"
      />
      <Product 
      title="water bottle" 
      description="A 1-litter ,plastic bottle" 
      price="Rs. 1,500"
      />
      <Product 
      title="shoes" 
      description="A pair of running shoes" 
      price="Rs. 5,000"
      /> */}

      {/* <div>
        <h2>
          Backpack
        </h2>
        <p>A Backpack with a laptop compartment</p>
        <p>Rs. 5,000</p>
        <h2>
          water bottle
        </h2>
        <p>A 1-litter ,plastic bottle</p>
        <p>Rs. 1,500</p>
        <h2>
          shoes
        </h2>
        <p>A pair of running shoes</p>
        <p>Rs. 5,000</p>
      </div> */}
    </div>
  );
}

export default App;
