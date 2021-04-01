DROP TABLE IF EXISTS user_details;
DROP TABLE IF EXISTS user_categories;
DROP TABLE IF EXISTS food_categories;
DROP TABLE IF EXISTS invitee_vote;
DROP TABLE IF EXISTS invitation_restaurant;
DROP TABLE IF EXISTS invitee_details;
DROP TABLE IF EXISTS invitation;
DROP TABLE IF EXISTS users;
REVOKE ALL PRIVILEGES ON ALL TABLES IN SCHEMA public FROM final_capstone_owner;
REVOKE ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public FROM final_capstone_owner;
REVOKE ALL PRIVILEGES ON ALL TABLES IN SCHEMA public FROM final_capstone_appuser;
REVOKE ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public FROM final_capstone_appuser;

CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username varchar(50) NOT NULL,
    password_hash varchar(200) NOT NULL,
    role varchar(50) NOT NULL,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    email VARCHAR NOT NULL
);

INSERT INTO users (username,password_hash,role,first_name,last_name,email) VALUES ('demouser','$2a$10$P6i2Ul0m9aFesrzCor06EO3YiKUrnY7vNJPfy47gndLGXqW8Xnhte','ROLE_USER','Demo','User','user@user.com');

CREATE TABLE IF NOT EXISTS user_details (
    user_id INTEGER PRIMARY KEY,
    address VARCHAR,
    city VARCHAR,
    state VARCHAR,
    zip VARCHAR,
    default_radius INTEGER DEFAULT 16100,
    CONSTRAINT fk_userid FOREIGN KEY(user_id) REFERENCES users (user_id)
    );
    
INSERT INTO user_details (user_id, address, city, state, zip, default_radius) VALUES (1,'413 N Market St', 'Wilmington', 'DE', '19801', 16100);

CREATE TABLE IF NOT EXISTS user_categories (
    user_id INTEGER,
    category_id INTEGER
);

INSERT INTO user_categories (user_id, category_id) VALUES
(1,1),(1,5),(1,8),(1,21);

CREATE TABLE IF NOT EXISTS food_categories (
    category_id SERIAL PRIMARY KEY,
    display_name VARCHAR,
    search_name VARCHAR
);

INSERT INTO food_categories (display_name, search_name) VALUES
('American','newamerican,tradamerican'),
('Asian','asianfusion, polynesian,malaysian,korean,filipino,taiwanese,hkcafe'),
('Bars/Pubs','bars,beergarden,beerhall,gastropubs'),
('Breakfast/Brunch','breakfast_brunch'),('BBQ','bbq'),('Burgers','burgers'),
('Chicken','chickenshop,chicken_wings'),('Chinese','chinese'),
('Comfort Food','comfortfood'),('Delis','delis'),('Greek','greek'),
('Healthy','salad,wraps'),('Indian','indpak'),('Italian','italian'),
('Japanese','japanese'),('Mexican','mexican,tex-mex,newmexican'),('Pizza','pizza'),
('Sandwiches','sandwiches,cheesesteaks'),('Seafood','seafood'),('Soup','soup'),('Steakhouse','steak'),
('Sushi','sushi'),('Vegetarian/Vegan','vegetarian,vegan');

CREATE TABLE IF NOT EXISTS invitation (
    invite_id SERIAL PRIMARY KEY,
    invite_name VARCHAR,
    location VARCHAR,
    radius INTEGER,
    creator_user_id INTEGER,
    deadline TIMESTAMPTZ,
    reservation_date_time TIMESTAMPTZ
);
              
CREATE TABLE IF NOT EXISTS invitee_details (
    invite_id INTEGER,
    unique_id VARCHAR NOT NULL,
    invitee_user_id INTEGER DEFAULT 0,
    name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    has_voted BOOLEAN DEFAULT false,
    is_attending VARCHAR DEFAULT 'Pending'
);
                
CREATE TABLE IF NOT EXISTS invitation_restaurant (
     invite_id INTEGER,
     yelp_id VARCHAR NOT NULL,
     total_thumbs_up INTEGER DEFAULT 0,
     total_thumbs_down INTEGER DEFAULT 0
);

CREATE TABLE IF NOT EXISTS invitee_vote (
    invite_id INTEGER,
    invitee_unique_id VARCHAR NOT NULL,
    yelp_id VARCHAR NOT NULL,
    thumbs_up BOOLEAN DEFAULT false,
    thumbs_down BOOLEAN DEFAULT false
);

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO final_capstone_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO final_capstone_owner;

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO final_capstone_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO final_capstone_appuser;

SELECT * FROM users;