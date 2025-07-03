create table route (
                       id serial primary key,
                       school varchar(255) null,
                       route varchar(255) not null,
                       created_at TIMESTAMP DEFAULT now(),
                       updated_at TIMESTAMP DEFAULT now()
);
create table gps_terminal (
                              id serial primary key,
                              mac_addr varchar(255) not null,
                              created_at TIMESTAMP DEFAULT now(),
                              updated_at TIMESTAMP DEFAULT now()
);
create table bus (
                     id serial primary key,
                     route_id bigint not null references route(id),
                     gps_terminal_id bigint not null references gps_terminal(id),
                     number varchar(255) null,
                     created_at TIMESTAMP DEFAULT now(),
                     updated_at TIMESTAMP DEFAULT now()
);

create table bus_location (
                              id serial primary key,
                              bus_id bigint not null references bus(id),
                              location GEOMETRY(POINT, 5179),
                              created_at TIMESTAMP DEFAULT now(),
                              updated_at TIMESTAMP DEFAULT now()
);
