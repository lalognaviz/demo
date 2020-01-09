drop table if exists videojuego;

CREATE TABLE `videojuegos`.`videojuego` ( 
`id` INT NOT NULL AUTO_INCREMENT , 
`nombre` VARCHAR(200) NOT NULL , 
`descripcion` VARCHAR(3000) ,
 `img_url` VARCHAR(1000)  , 
PRIMARY KEY (`id`)) ; 

INSERT INTO videojuego (nombre,descripcion,img_url) VALUES
('bioshock','un juego','https://www.threezerohk.com/wp-content/uploads/2017/09/BS_BigDaddy_4801.jpg'),
('monkey island','un juego','   http://images.fanpop.com/images/image_uploads/Monkey-Island-monkey-island-530458_1024_768.jpg'),               
('Fallout','juego','https://images.gamewatcherstatic.com/image/file/3/90/72033/fallout4.jpg'),
('bioshock','el juego',' http://images4.fanpop.com/image/photos/15600000/BioShock-bioshock-15605963-1600-1200.jpg'),     
('bioshock infinite','another game',' https://assets1.ignimgs.com/2019/01/05/bioshock-infinite---button-1546669924735.jpg'),
('mirrors edge','juego parkour','https://media.moddb.com/images/downloads/1/131/130532/mirrors-edge-standard-edition_pd.jpg'),  
('resident evil 5','juegazo','https://3.bp.blogspot.com/-e5vzY8fNmo8/Uta8W3UQBOI/AAAAAAAAAhg/sxIskb7gJMA/s1600/7-2.png'),
('LBA2','otro juego','http://www.extragry.pl/media/gallery/large/103650158020110216152458.jpg');
                       
