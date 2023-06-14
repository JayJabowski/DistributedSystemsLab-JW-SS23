# Use the official PostgreSQL image from Docker Hub
FROM postgres:latest

# Set environment variables for database configuration
ENV POSTGRES_USER ToDoApp
ENV POSTGRES_PASSWORD DistributedSystems
ENV POSTGRES_DB ToDoApp

# Expose the PostgreSQL port
EXPOSE 5432

# Create a directory for the database data
RUN mkdir -p /var/lib/postgresql/data

# Change the ownership and permissions of the data directory
RUN chown -R postgres:postgres /var/lib/postgresql/data
RUN chmod 777 /var/lib/postgresql/data

# Set the data directory as a Docker volume
VOLUME /var/lib/postgresql/data

# Expose the default PostgreSQL port
EXPOSE 5432

# Start the PostgreSQL service
CMD ["postgres"]
