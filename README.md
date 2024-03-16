## Liquibase Spring boot 🚀💻

- Helps in multiple database versions.
- It is an opensource

## Advantages

- Automatic updates
- Automatic creation and creation of roll backups.

  ## Supported formats
  - XML
  - JSON
  - SQL
  - YAML

    Changelog -> contains 1 or more change sets

## Change sets

A changedset describes a set of database that liquibase executes within one transaction.

To enable successful rollbacks and keep track of the executed changesets, each changeset is identifield by ``Àuthor name ``, `ìd`` (can  be any unique id like 1, 2, 3 or time stamp)


In Liquibase, a rollback refers to the process of reverting your database schema to a previous state. This can be helpful in case you make a change to your database schema that introduces errors or unexpected behavior. Liquibase provides functionalities to rollback changes to specific points in time or by specific versions.

## some key points about rollback in Liquibase:

Rollback Commands: Liquibase offers various commands to control rollbacks, including:
rollback-to-tag: Rolls back changes to the database schema until it reaches a specific tag you define in your changelog file.
rollback-count: Reverts a specified number of changes from the most recent ones applied.
rollback-date: Rolls back changes made after a particular date and time.
Changelog File: Liquibase uses a changelog file (usually named changelog.xml) to track all the database schema changes you've made. This file is crucial for rollbacks as it stores information about each change and its execution timestamp.
Rollback Limitations: It's important to understand that rollbacks might not always be perfect. Depending on the type of changes made, some data loss might occur during the rollback process.

## Benefits of using Liquibase rollback:

Recover from errors: If a schema change introduces issues, you can rollback to a previous working state.
Safe experimentation: Liquibase allows you to experiment with schema changes and easily revert them if necessary.
Version control: By tracking schema changes in the changelog file, you can maintain a history of your database schema evolution.

## Configuration

spring.liquibase.change-log=classpath:db/changelog/changelog-master.xml or yaml

check liquibase best practices Visit [link](liquibase.com)
