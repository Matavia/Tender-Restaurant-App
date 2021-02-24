{
    
    computed: {
        filterproductsredone: function(){
            return this.products.
                filter((product) => )
        },
        filterProducts: function() {
            return this.filterProductsByRange(this.filterProductsByName(this.filterProductsByCategory(this.products)))
        }
    },
    methods: {
        filterProductsByCategory: function(products) {
            return products.filter(product => !product.category.indexOf(this.category))
        },
        filterProductsByName: function(products) {
            return products.filter(product => !product.name.indexOf(this.name))
        },
        filterProductsByRange: function(products) {
            return products.filter(product => (product.price > 0 && product.price < this.range) ? product : '')
        }
    }
}
